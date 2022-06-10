fun main() {
    val count = mapOf(1 to "one", 2 to "two", 3 to "three")
    val countOtherWay = mapOf(Pair(1, "one"), Pair(2, "two"), Pair(3, "three"))
    println(count)
    println(countOtherWay)

    val emptyMap = mapOf<Int, String>()
    println(emptyMap)

    println(count.get(2))
    println(count[3])

    println(count.keys)
    println(count.values)
}