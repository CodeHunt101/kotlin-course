fun main() {
    fun decide(color: Colors) {}

    val color = Colors.RED
    when (color) {
        Colors.RED -> println("You chose red")
        Colors.GREEN -> println("You chose green")
        Colors.BLUE -> println("You chose blue")
    }

    println(Colors2.RED.timesUsed)
    println(Colors2.RED.name)
    println(Colors2.RED.ordinal)
}

enum class Colors {
    RED,
    GREEN,
    BLUE
}

enum class Colors2(val timesUsed: Int) {
    RED(34),
    GREEN(12),
    BLUE(64)
}