import kotlin.random.Random

fun main() {

    for (i in 1..5) {
        val drinkCoffee = makeCoffee1()
        drinkCoffee.drink()
    }

}

interface Coffee {
    fun drink()
}

class Arabica : Coffee {
    override fun drink() {
        println("Drinking arabica")
    }
}

class Robusta : Coffee {
    override fun drink() {
        println("Drinking robusta")
    }
}

fun makeCoffee1(): Coffee {
    val randomNumber = System.currentTimeMillis()
    return if (randomNumber % 2 == 0L) Arabica() else Robusta()
}