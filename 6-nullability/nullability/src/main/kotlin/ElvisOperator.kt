fun main() {
    val catName: String? = null

    println(catName?:"This cat has no name")

    println(catName?:"Fluffy".length)
}