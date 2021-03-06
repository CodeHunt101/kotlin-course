fun main() {
    val myDog: Dog = Pug("pug")
    val yourDog: Dog = BassetHound("basset hound")
    val hisDog: Dog = Chihuahua("chihuahua")

    myDog.play()
    myDog.bark()
    myDog.run()

    yourDog.play()
    yourDog.bark()
    yourDog.run()

    hisDog.play()
    hisDog.bark()
    hisDog.run()
}

abstract class Dog(name: String) {
    abstract fun run()
    abstract fun bark()
    abstract fun play()
}

class Pug(private val name: String) : Dog(name) {
    override fun run() {
        println("A $name can run")
    }

    override fun bark() {
        println("A $name cannot bark")
    }

    override fun play() {
        println("A $name cannot play")
    }
}

class BassetHound(private val name: String) : Dog(name) {
    override fun run() {
        println("A $name cannot run")
    }

    override fun bark() {
        println("A $name can bark")
    }

    override fun play() {
        println("A $name can play")
    }
}

class Chihuahua(private val name: String) : Dog(name) {
    override fun run() {
        println("A $name can run")
    }

    override fun bark() {
        println("A $name can bark")
    }

    override fun play() {
        println("A $name cannot play")
    }
}