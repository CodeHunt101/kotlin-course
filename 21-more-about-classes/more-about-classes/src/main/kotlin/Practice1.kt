fun main() {
    val table1 = Table()
    val table2 = Table(1)
    val table3 = Table(6, 170)

    table1.printInfo()
    table2.printInfo()
    table3.printInfo()
}

class Table {
    constructor() {
        height = 120
        legs = 4
    }

    constructor (newLegs: Int) {
        legs = newLegs
        height = 130
    }

    constructor(newLegs: Int, newHeight: Int) {
        legs = newLegs
        height = newHeight
    }

    var legs: Int?
    var height: Int?

    fun printInfo() {
        println("This table has $legs legs and height of $height")
    }
}