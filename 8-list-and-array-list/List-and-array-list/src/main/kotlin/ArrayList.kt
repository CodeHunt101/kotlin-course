fun main() {
    val colours = arrayListOf("blue", "red")
    println(colours)

    val noColours = arrayListOf<String>()
    println(noColours)

    val another = mutableListOf("blue", "red")

    println(colours == another)

    another.add("yellow")
    println(another)

    val moreColours = mutableListOf("pink", "teal")

    colours.addAll(moreColours)
    println(colours)

    colours.remove("red")
    println(colours)

    colours.removeAll(moreColours)
    println(colours)

    another.removeAt(1)
    println(another)

    val items = arrayListOf("laptop", "mouse", "pen", "paper", "mug", "phone")
    val removedItems = listOf("pen", "paper", "mug", "phone")

    items.removeAll(removedItems)
    println(items)

//    Functions

    val newColours = arrayListOf("blue", "red", "green", "yellow")
    newColours.set(1, "redder")
    println(newColours)

    val subColours = newColours.subList(1,3)
    println(subColours)
    println(subColours::class.java)

    newColours.clear()
    println(newColours)
    println(newColours.isEmpty())

}