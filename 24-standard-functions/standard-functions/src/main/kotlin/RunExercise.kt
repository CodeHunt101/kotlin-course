fun main() {
    val laptop = Laptop().run {
        turnOff()
        turnOn()
    }
}

class Laptop {
    fun turnOff() {
        println("turning off")
    }

    fun turnOn() {
        println("turning on")
    }
}