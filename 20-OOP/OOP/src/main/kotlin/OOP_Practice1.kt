fun main() {
    val zebra = Animal()

    zebra.name = "Zebra"
    zebra.topSpeed = 30
    zebra.run()

    zebra.topSpeed = 40
    zebra.run()
}

class Animal {
    var name = ""
    var topSpeed: Int? = null

    fun run() {
        println("The top speed of a $name is $topSpeed")
    }
}