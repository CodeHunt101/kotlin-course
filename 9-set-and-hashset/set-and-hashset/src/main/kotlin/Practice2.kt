fun main() {
    val numbers = setOf(2, 3, 5, 7, 11, 13, 17, 19, 23, 29)
    println(numbers.contains(21))

    val myDrinks = mutableSetOf("water", "coke", "beer", "orange juice")
    val theirDrinks = setOf("water", "orange juice", "milk", "berry")

    myDrinks.retainAll(theirDrinks)
    println(myDrinks)
}