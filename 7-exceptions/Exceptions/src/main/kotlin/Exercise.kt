fun main() {
    println("Please enter the product to buy:")
    val product = readLine()

    println("How many products do you require?")

    val price = 9.99

    try {
        val quantity = readLine()?.toInt()
        val total = quantity?.times(price)
        println("Item: $product, Quantity: $quantity")
        println("Total: $total")
    } catch(e: Exception) {
        println("Your quantity is incorrect!")
        e.printStackTrace()
    }
}