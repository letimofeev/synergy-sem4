package task1

class Task1 {

    fun collectPositiveStats(array: IntArray): PositiveElementsStats {
        var sum = 0
        var count = 0

        for (element in array) {
            if (element > 0) {
                sum += element
                count++
            }
        }

        return PositiveElementsStats(
            sum = sum,
            count = count,
        )
    }

    data class PositiveElementsStats(
        val sum: Int,
        val count: Int,
    )
}