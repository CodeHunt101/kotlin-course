fun main() {
    val myTruck = Truck()
    println(myTruck.speed)
    myTruck.speed = 100
    println("Truck name: ${myTruck.name}")
    println("Truck speed: ${myTruck.speed}")
    myTruck.speed = 80
    println("Truck name: ${myTruck.name}")
    println("Truck speed: ${myTruck.speed}")
}

class Truck {
    var name = ""
    var speed: Int? = null
        set(value) {
            name = "High speed truck $value"
            field = value
        }
}