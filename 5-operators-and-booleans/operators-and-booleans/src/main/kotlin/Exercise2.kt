fun main() {
    val children = 2
    val cows = 3

    val produceMilk = true
    val farmer = 1
    val family = children + farmer


    if (((cows <= 5) && produceMilk) || (family >= 3)) {
        println("Farmer receives funding")
    } else {
        println("Can't apply")
    }
}