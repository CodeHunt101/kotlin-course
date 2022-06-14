fun main() {
    val arithmetic = Math()

    arithmetic.add(1.0, 2.0)
    arithmetic.multiply(1.55, 2.16)
    arithmetic.subtract(10.3, 30.2)
    arithmetic.divide(3232.23, 0.8373)
}

class Math {
    fun add(a: Double, b: Double) = println(a + b)
    fun multiply(a: Double, b: Double) {
        println(a * b)
    }

    fun subtract(a: Double, b: Double) {
        println(a - b)
    }

    fun divide(a: Double, b: Double) {
        println(a / b)
    }
}