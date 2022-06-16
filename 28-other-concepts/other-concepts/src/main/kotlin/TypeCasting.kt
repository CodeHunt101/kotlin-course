fun main() {
    val value = "Testing my strings"

    if (value is String) {
        println("This is a string")
    }


    val myCar: Car = getCar()

    if (myCar !is BMW) {
        println("Not my fav brand")
    }

//    (myCar as BMW).drive()

    val bmwCar = myCar as? BMW
    bmwCar?.drive()

}

open class Car {}
class BMW: Car() {
    fun drive() {
        println("Driving my BMW")
    }
}

fun getCar(): Car = BMW()