fun main() {
    val count = mutableMapOf(1 to "one", 2 to "two", 3 to "three")
    val countOtherWay = mutableMapOf(Pair(1, "one"), Pair(2, "two"), Pair(3, "three"))
    println(count)
    println(countOtherWay)

    val emptyMap = mutableMapOf<Int, String>()
    println(emptyMap)

    println(count.get(2))
    println(count[3])

    println(count.keys)
    println(count.values)

    count.put(5, "five")
    count[6] = "six"

    println(count)

    val countMore = mapOf(20 to "twenty", 30 to "thirty")
    count.putAll(countMore)
    println(count)

    count.remove(20)
    println(count)

    count.replace(2, "two-two")
    println(count)

    count.clear()
    println(count)
}