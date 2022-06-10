fun main() {
    val acceptedColors = hashSetOf("white", "black", "grey")
    val myColors = hashSetOf("blue", "red", "black", "green")

    myColors.retainAll(acceptedColors)
    println(myColors)
}

