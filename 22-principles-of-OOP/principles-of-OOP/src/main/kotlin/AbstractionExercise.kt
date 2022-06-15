fun main() {
    val myOven: Oven = Bosch()
    myOven.cook()

    val myRoaster: Oven = Roaster()
    myRoaster.cook()
}

abstract class Oven {
    var cookingSpeed = 120
    open val averageTemperature = 180

    abstract fun cook()
}

class Bosch : Oven() {
    override val averageTemperature: Int = 210

    override fun cook() {
        println("cooking food at $averageTemperature degrees at $cookingSpeed speed")
    }

}

class Roaster : Oven() {
    override fun cook() {
        println("roasting food at $averageTemperature degrees at $cookingSpeed speed")
    }

}