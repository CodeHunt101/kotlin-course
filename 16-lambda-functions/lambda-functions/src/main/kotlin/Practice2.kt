fun main() {
    val numbers = setOf(3, 456, 34, 67, 4, 12)
    println(numbers.filter { it in 10..99 })

    val clients = listOf("Tom", "Laura", "Dennis", "Mark")
    println(clients.sortedBy { it[it.length - 1] })

    val ints = listOf(372, 285, 836, 994, 836, 216)
    println(ints.maxByOrNull { it.toString()[it.toString().length / 2].code })
    println(ints.maxByOrNull { it / 10 % 10 })

}