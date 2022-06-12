fun main() {
    val numbers = mutableListOf(20, 45, 67, 432, 3445, 32)

    println(divideBy10(numbers) { number: Double -> number / 10 })
}

fun divideBy10(integers: MutableList<Int>, lbd: (Double) -> Double): MutableList<Double> {
    val result = mutableListOf<Double>()
    for (integer in integers) {
        if (integer % 2 == 0)
            result.add(lbd(integer.toDouble()))
    }
    return result
}