fun main() {
    val myLaptop = Laptop()
    myLaptop.run()
    val myApple = Apple()
    myApple.screenSize = 15
    myApple.run()
}

open class Laptop {
    var screenSize = 20
    val color = "Black"

    fun run() {
        println("Screen size: $screenSize and color: $color")
    }
}

class Apple : Laptop()