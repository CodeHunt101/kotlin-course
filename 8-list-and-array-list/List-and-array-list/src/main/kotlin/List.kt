fun main() {
    val colors = listOf("blue", "red", "yellow")
    println(colors)

    val colors2 = listOf<String>()
    println(colors2)

    val colors3 = listOf("blue", "red", "blue", "green")
    println(colors3)

//    Can contain nulls
    val colors4 = listOf("blue", null, "blue", "red", null)
    println(colors4)

    println(colors[0])

    println(colors[colors.size -1])

    println(colors4.get(1))

//    Functions
    println(colors.contains("red"))
    println(colors.contains("pink"))

    val newColors = listOf("red", "green")
    println(colors3.containsAll(newColors))
    println(colors.indexOf("blue"))
    println(colors3.lastIndexOf("blue"))
}