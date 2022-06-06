fun main() {
    var price = 29.99

    println("How many products?:")
    var number = readLine()?.toInt()?:3

    println("Total is ${number * price}")


}