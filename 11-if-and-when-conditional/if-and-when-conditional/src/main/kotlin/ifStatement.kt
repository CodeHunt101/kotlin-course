fun main() {
    val hasEggs = true
    val hasBacon = true
    val eggPrice = 5.00
    val baconPrice = 20.00
    var eggsQuantity = 0
    var baconQuantity = 0

    if (hasEggs) {
        eggsQuantity = 12
        if (hasBacon) {
            baconQuantity = 2
        }
    }
    val total = eggsQuantity * eggPrice + baconQuantity * baconPrice

    println("The man spent $$total at the market.")
}