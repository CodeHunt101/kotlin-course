fun main() {
//    val bird = Bird()
//    bird.fly()

    val parakeet = Parakeet()
    parakeet.fly()
}

open class Bird {
    open val colour = "Yellow"
    open val flightSpeed = 30

    open fun fly() {
        println("A Bird is $colour flies at $flightSpeed mps")
    }
}

class Parakeet : Bird() {
    override val colour = "Brown"
    override val flightSpeed = 60

    override fun fly() {
        super.fly()
        println("A Bird is ${super.colour} flies at ${super.flightSpeed} mps")
    }
}