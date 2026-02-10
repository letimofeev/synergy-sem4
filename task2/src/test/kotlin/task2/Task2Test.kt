package task2

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class Task2Test {

    private val task2 = Task2()

    @Test
    fun `all elements greater than B`() {
        val array = intArrayOf(5, 6, 7)
        val b = 4

        val result = task2.collectGreaterThanBStats(array, b)

        assertEquals(3, result.count)
        assertEquals(210, result.product)
    }

    @Test
    fun `no elements greater than B`() {
        val array = intArrayOf(1, 2, 3)
        val b = 5

        val result = task2.collectGreaterThanBStats(array, b)

        assertEquals(0, result.count)
        assertEquals(0, result.product)
    }

    @Test
    fun `mixed elements`() {
        val array = intArrayOf(2, 5, 1, 8)
        val b = 3

        val result = task2.collectGreaterThanBStats(array, b)

        assertEquals(2, result.count)
        assertEquals(40, result.product)
    }

    @Test
    fun `array with negative values`() {
        val array = intArrayOf(-1, 4, -3, 6)
        val b = 0

        val result = task2.collectGreaterThanBStats(array, b)

        assertEquals(2, result.count)
        assertEquals(24, result.product)
    }

    @Test
    fun `empty array`() {
        val array = intArrayOf()
        val b = 10

        val result = task2.collectGreaterThanBStats(array, b)

        assertEquals(0, result.count)
        assertEquals(0, result.product)
    }
}
