fun main() {
    val son = Son()
    son.printName()
}

open class Father {
    open val firstName = "Hernando"
    open val lastName = "Torres"

    open fun printName() {
        println("$firstName $lastName")
    }
}

class Son : Father() {
    override val firstName = "Harold"

    override fun printName() {
        super.printName()
        println("His father is ${super.firstName} $lastName")
    }
}