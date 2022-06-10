fun main() {
    val count = mapOf(1 to "one", 2 to "two", 3 to "three")
    println(count.size)

    println(count.containsKey(2))
    println(count.containsValue("one"))
    println(count.isEmpty())
    println(count.isNotEmpty())
}