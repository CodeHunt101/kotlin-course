fun main() {
    var catName: String? = "Minnie"
    println(catName?.length)

    catName = null
    println(catName?.length)

//    Safe calls can be chained
    println(catName?.length?.toString())
}