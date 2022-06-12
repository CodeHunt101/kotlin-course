fun main() {
    addTax("TV", 100.0)

    val products = mapOf(
        "TV" to 100.0,
        "Laptop" to 1800.0,
        "Phone" to 700.0
    )

    addTax(products)
}

fun addTax(productName: String, price: Double?) {
    val cost = price?.times(1.2)
    println("The cost of a $productName is $$cost")
}

fun addTax(productsInfo: Map<String, Double>) {
    for (productName in productsInfo.keys)
        addTax(productName, productsInfo[productName])
}