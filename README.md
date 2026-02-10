# Задачи 4 семестр

---

## Структура проекта

```
project-root/
├── task1/
├── task2/
├── task3/
├── task4/
├── build.gradle
├── settings.gradle
├── gradlew
├── gradlew.bat
└── .gitignore
```

### Task1 и Task2 (Kotlin + Gradle)
```
taskX/
├── flowchart/
│   ├── flowchart.mermaid
│   └── flowchart.pdf
├── src/
│   ├── main/kotlin/taskX/TaskX.kt
│   └── test/kotlin/taskX/TaskXTest.kt
└── build.gradle
```
Назначение каталогов:

1. `flowchart/` - блок-схемы алгоритмов (исходник Mermaid и экспорт в PDF)
2. `src/main/kotlin/` - основной код программы
3. `src/test/kotlin/` - тесты
4. `build.gradle` - конфигурация сборки конкретной задачи

### Task3 (Python)
```
task3/
└── task3.py
```
Задача на Python представлена в виде одного скрипта

### Task4 (HTML + JavaScript)
```
task4/
├── index.html
└── script.js
```
Задача реализована как клиентское веб-приложение:
1. `index.html` - разметка и стили интерфейса
2. `script.js` - логика обработки данных и вычислений