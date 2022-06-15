fun main() {

}

open class Airplane {
    var type = "Airbus"
    fun fly() {
        println("Flying")
    }
}

class MyAirPlane : Airplane() {
    fun takeOff() {
        println(type)
        fly()
    }
}

class MyCar {
    fun start() {
        val airplane = Airplane()
        println(airplane.type)
        airplane.fly()
    }
}