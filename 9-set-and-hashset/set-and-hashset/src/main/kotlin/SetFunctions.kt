fun main() {
    val numbers = setOf(3, 6, 4, null, 8)
    println(numbers.size)

    println(numbers.contains(4))
    println(numbers.contains(5))

    val newNumbers = setOf(4, 6)
    println(numbers.containsAll(newNumbers))
    
    println(numbers.isEmpty())

}