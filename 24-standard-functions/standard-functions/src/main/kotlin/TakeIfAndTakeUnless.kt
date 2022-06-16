import kotlin.random.Random

fun main() {
    val number = Random.nextInt(100)
    val evenOrNull = number.takeIf { it % 2 == 0 }
    println(number)
    println(evenOrNull)
    println()

    val number2 = Random.nextInt(100)
    val evenOrNull2 = number2.takeUnless { it % 2 == 0 }
    println(number2)
    println(evenOrNull2)


}