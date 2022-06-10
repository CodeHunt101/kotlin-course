fun main() {
    val numbers = mutableSetOf(3, 7, 5, null, 7)
    val noNumbers = hashSetOf<Int>()

    println(numbers)
    println(noNumbers)

    numbers.add(44)
    println(numbers)

    val newNumbers = mutableSetOf(56, 34, 78)
    numbers.addAll(newNumbers)
    println(numbers)

    numbers.remove(56)
    println(numbers)

    val toRemove = setOf(3, 5, 8745)
    numbers.removeAll(toRemove)
    println(numbers)
}