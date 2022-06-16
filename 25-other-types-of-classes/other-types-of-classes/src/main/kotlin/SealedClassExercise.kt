import kotlin.random.Random

fun main() {
    for (i in 1..10) {
        lottery()
    }
}

fun lottery() {
    val prizes = listOf(House, Holidays, Gift)

    when (prizes.random()) {
        is House -> println("Won house")
        is Holidays -> println("Won holidays")
        is Gift -> println("Won gift")
    }
}

sealed class Prize

object House : Prize()
object Holidays : Prize()
object Gift : Prize()


