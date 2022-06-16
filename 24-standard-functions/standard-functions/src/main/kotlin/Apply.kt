fun main() {
    val myCheetah = Cheetah().apply {
        speed = 50
        color = "red"
        runCheetah()
    }

    println(myCheetah)
}

class Cheetah {
    var speed = 50
    var color = "yellow"

    fun runCheetah() {
        println("Cheetah of color $color runs at $speed")
    }
}