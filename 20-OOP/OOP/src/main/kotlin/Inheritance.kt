fun main() {
    val myDog = Corgi()
    myDog.bark()
    myDog.size = 19
    myDog.play()
    println(myDog.breed)
}

open class Dog {
    var size = 0

    fun bark() {
        println("Woof")
    }

    fun play() {
        println("ahahahah")
    }
}

class Corgi : Dog() {
    var breed = "french"
}