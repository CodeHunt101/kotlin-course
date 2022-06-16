import kotlin.random.Random

fun main() {
    val animals = getAnimals()
    animals.forEach {animal ->
        (animal as? Dog)?.bark()
        (animal as? Cat)?.purr()
    }
}

abstract class Animal()

class Cat : Animal() {
    fun purr() {
        println("mew")
    }
}

class Dog : Animal() {
    fun bark() {
        println("woof")
    }
}

fun getAnimals(): MutableList<Animal> {
    val animals = mutableListOf<Animal>()

    for (i in 1..20) {
        animals.add(
            if (Random.nextInt() % 2 == 0) Dog()
            else Cat()
        )
    }

    return animals
}