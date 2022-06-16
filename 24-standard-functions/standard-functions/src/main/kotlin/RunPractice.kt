fun main() {
    val rest = Restaurant().run {
        standardDish = "Fish and chips"
        todaySpecial = "Lasagne"
        printMenu()
        this
    }

    print(rest)
}

class Restaurant {
    var standardDish = ""
    var todaySpecial = ""

    fun printMenu() {
        println("The standard dish is $standardDish")
        println("The special dish is $todaySpecial")
    }
}