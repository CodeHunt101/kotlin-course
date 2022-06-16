fun main() {
    Airplane().takeOff()
}

class Airplane {

    fun takeOff() {
        Engine("Engine 1").run()
        Engine("Engine 2").run()
        println("Airplane taking off")
    }

    private inner class Engine(private val name: String) {
        fun run() {
            println("$name running")
        }
    }
}