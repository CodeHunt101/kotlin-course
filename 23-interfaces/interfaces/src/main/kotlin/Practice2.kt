fun main() {
    val myCar = CarFactory().createCar()
    myCar.park()
    myCar.drive()
    myCar.speed()

}

interface Car {
    fun drive()
    fun park()
    fun speed()
}

class BMW : Car {
    override fun drive() {
        println("BMW driving")
    }

    override fun park() {
        println("BMW parking")
    }

    override fun speed() {
        println("BMW speeding")
    }
}

class CarFactory {
    fun createCar(): Car {
        return BMW()
    }
}