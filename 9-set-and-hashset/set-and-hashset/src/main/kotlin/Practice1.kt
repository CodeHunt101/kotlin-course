fun main() {
    val colours = mutableSetOf<String>()
    colours.addAll(listOf("blue", "red", "green"))
    println(colours)

    colours.remove("red")
    println(colours)

    val deskItems = mutableSetOf("book", "laptop", "monitor", "certificate", "headphones", "letters", "box", "mask")
    val objectsToRemove = setOf("book", "box", "mask", "letters", "certificate")

    deskItems.removeAll(objectsToRemove)
    println(deskItems)
}