package task1

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class Task1Test {

    private val task1 = Task1()

    @Test
    fun `all elements are positive`() {
        val array = intArrayOf(1, 2, 3, 4)

        val result = task1.collectPositiveStats(array)

        assertEquals(10, result.sum)
        assertEquals(4, result.count)
    }

    @Test
    fun `all elements are negative`() {
        val array = intArrayOf(-1, -5, -10)

        val result = task1.collectPositiveStats(array)

        assertEquals(0, result.sum)
        assertEquals(0, result.count)
    }

    @Test
    fun `mixed elements`() {
        val array = intArrayOf(-2, 0, 5, -1, 3)

        val result = task1.collectPositiveStats(array)

        assertEquals(8, result.sum)
        assertEquals(2, result.count)
    }

    @Test
    fun `array with zeros only`() {
        val array = intArrayOf(0, 0, 0)

        val result = task1.collectPositiveStats(array)

        assertEquals(0, result.sum)
        assertEquals(0, result.count)
    }

    @Test
    fun `empty array`() {
        val array = intArrayOf()

        val result = task1.collectPositiveStats(array)

        assertEquals(0, result.sum)
        assertEquals(0, result.count)
    }
}