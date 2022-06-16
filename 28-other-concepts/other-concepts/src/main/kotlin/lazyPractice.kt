import kotlin.random.Random

fun main() {
    val ints: MutableList<Int> by lazy {
        generate1000Integers()
    }

    println("Do you want to print 1000 random ints? Y/N")
    val input = readln()

    if (input == "Y") {
        println(ints)
    }
}

fun generate1000Integers():MutableList<Int> {
    val result = mutableListOf<Int>()
    for (i in 1..1000) {
        result.add(Random.nextInt())
    }
    return result
}

