fun main() {
    val name = "Harold"
    println(name.slim())
    println(name.betterLength)
}
// Cannot be local eg. declared inside a function or class

// Extension function
fun String.slim() = this.substring(1, length - 1)

// Extension property (Not common to use. Lots of limitations)
val String.betterLength: Int
    get() = 200