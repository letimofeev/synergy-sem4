document.getElementById("calculateBtn").addEventListener("click", handleClick);

function handleClick() {
    const input = document.getElementById("dateInput").value.trim();
    const daysDiv = document.getElementById("daysResult");
    const leapDiv = document.getElementById("leapYearResult");

    daysDiv.textContent = "";
    leapDiv.textContent = "";
    daysDiv.classList.remove("error");
    leapDiv.classList.remove("error");

    const validationError = validateDate(input);
    if (validationError) {
        daysDiv.textContent = validationError;
        daysDiv.classList.add("error");
        return;
    }

    const days = calculateDaysToNewYear(input);
    const leapInfo = isLeapYearFromDate(input);

    daysDiv.textContent = `Дней до Нового года: ${days}`;
    leapDiv.textContent = leapInfo;
}

function validateDate(dateString) {
    const regex = /^\d{2}\.\d{2}\.\d{4}$/;
    if (!regex.test(dateString)) {
        return "Введите дату в формате дд.мм.гггг";
    }

    const [dayStr, monthStr, yearStr] = dateString.split(".");
    const day = parseInt(dayStr, 10);
    const month = parseInt(monthStr, 10);
    const year = parseInt(yearStr, 10);

    if (month < 1 || month > 12) {
        return "Некорректный месяц";
    }

    const daysInMonth = getDaysInMonth(month, year);
    if (day < 1 || day > daysInMonth) {
        return "Некорректный день для указанного месяца";
    }

    return null;
}

function getDaysInMonth(month, year) {
    const isLeap =
        (year % 4 === 0 && year % 100 !== 0) ||
        (year % 400 === 0);

    const days = [31, isLeap ? 29 : 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31];
    return days[month - 1];
}

function calculateDaysToNewYear(dateString) {
    const [day, month, year] = dateString.split(".").map(Number);

    const inputDate = new Date(year, month - 1, day);
    const newYearDate = new Date(year, 11, 31);

    const oneDay = 1000 * 60 * 60 * 24;
    const diff = newYearDate - inputDate;

    return Math.ceil(diff / oneDay);
}

function isLeapYearFromDate(dateString) {
    const year = parseInt(dateString.split(".")[2], 10);

    const isLeap =
        (year % 4 === 0 && year % 100 !== 0) ||
        (year % 400 === 0);

    return isLeap ? "Год високосный" : "Год не високосный";
}
