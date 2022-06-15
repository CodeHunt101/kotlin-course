fun main() {
    val myOven: Oven = getOven()
    myOven.turnOn()
    myOven.turnOff()
    myOven.cook(150)
}

interface Oven {
    //    Not usual
    val temperature: Int

    //    It usually stores methods and without body.
    fun turnOn()
    fun turnOff()

    //    Not usual
    fun cook(temp: Int) {
        println("Cooking at $temp degrees")
    }
}

class Bosch : Oven {
    override val temperature: Int = 180

    override fun turnOn() {
        println("Turning on")
    }

    override fun turnOff() {
        println("Turning off")
    }

}

fun getOven(): Oven {
    return Bosch()
}