/* Create a calculator class. It should have
A variable that stores the total
A function that adds a number to the total
A function that subtracts a number from the total
A function that multiplies the total by an amount
A function that divides the total by an amount
A function that resets the total to 0
Create an object, test out the functions and print out some results. */

fun main() {
    val value = Calculator()

    println(value.total)
    println(value.add(5))
    println(value.subtract(1))
    println(value.multiply(10))
    println(value.divide(20))
    println(value.reset())
}

class Calculator {
    var total = 0

    fun add(num: Int): Int {
        total += num
        return total
    }

    fun subtract(num: Int): Int {
        total -= num
        return total
    }

    fun multiply(num: Int): Int {
        total *= num
        return total
    }

    fun divide(num: Int): Int {
        total /= num
        return total
    }

    fun reset(): String {
        total = 0
        return "Number reset to 0"
    }
}