fun main() {
    val newCar = Car2().run {
        speed = 70
        drive()
        println("Hello")
        println(this)
    }
//    println(newCar)

    run {
        val newCar2 = Car2()
        newCar2.speed = 500
        newCar2.drive()
    }
//    println(newCar2)

    with(Car2()) {
        speed = 70
        drive()
        println("Hello")
    }
}

class Car2 {
    var speed = 10
    fun drive() {
        println("Car is driving at $speed")
    }
}