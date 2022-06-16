fun main() {
    val results = Olympics()

    println(results.medal(1))
    println(results.position(Medals.NONE))
}

enum class Medals(val position: Int) {
    GOLD(1),
    SILVER(2),
    BRONZE(3),
    NONE(4)
}

class Olympics {
    fun medal(position: Int): Medals {
        return when (position) {
            1 -> Medals.GOLD
            2 -> Medals.SILVER
            3 -> Medals.BRONZE
            else -> Medals.NONE
        }
    }

    fun position(medal: Medals) = medal.position
}