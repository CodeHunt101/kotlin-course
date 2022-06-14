fun main() {
    val myCar = Car("BMW", 220)
    val myMotorBike = MotorBike()
    println("Model: ${myMotorBike.model}, Top Speed: ${myMotorBike.topSpeed}")

    val myMotorBike2 = MotorBike("Fiat")
    println("Model: ${myMotorBike2.model}, Top Speed: ${myMotorBike2.topSpeed}")

    val myMotorBike3 = MotorBike("AKT", 170)
    println("Model: ${myMotorBike3.model}, Top Speed: ${myMotorBike3.topSpeed}")
}

class Car(var model: String, var topSpeed: Int)

class MotorBike {
    constructor() {
        model = "No model"
        topSpeed = 150
    }

    constructor(newModel: String) {
        model = newModel
        topSpeed = 150
    }

    constructor(newModel: String, newSpeed: Int) {
        model = newModel
        topSpeed = newSpeed
    }

    var model: String? = null
    var topSpeed = 100
}