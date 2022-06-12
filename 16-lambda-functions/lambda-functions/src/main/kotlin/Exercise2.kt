fun main() {
    val ints = listOf(34, 67, 76, 45, 3435, 345, 67, 23, 5, 3, 56, 324, 5, 43, 90)

    val updatedInts = ints.map { if (it % 2 != 0) it * 2 else it / 2 }.filter { it > 25 }
    println(updatedInts)
}