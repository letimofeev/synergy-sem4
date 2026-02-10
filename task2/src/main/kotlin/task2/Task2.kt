package task2

class Task2 {

    fun collectGreaterThanBStats(array: IntArray, b: Int): GreaterThanBStats {
        var count = 0
        var product = 1

        for (element in array) {
            if (element > b) {
                count++
                product *= element
            }
        }

        if (count == 0) {
            product = 0
        }

        return GreaterThanBStats(
            count = count,
            product = product,
        )
    }

    data class GreaterThanBStats(
        val count: Int,
        val product: Int,
    )
}
