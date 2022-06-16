fun main() {
    val plane = Plane()
    plane.drive()

//    val engine = Plane().Engine()
//    engine.run()
}

class Plane {
    private val engine = Engine()
    private var speed = 100
    fun drive() {
        engine.run()
        println("Driving at $speed")
    }

    private inner class Engine {
        private val rpm = 1000
        fun run() {
            println("Engine is running at $rpm rpm")
            this@Plane.speed = 50
        }
    }
}