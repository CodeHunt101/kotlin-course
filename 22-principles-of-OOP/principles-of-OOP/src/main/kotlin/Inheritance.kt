fun main() {
    val carol = Daughter("Spanish")
    println(carol.hairColor)
    carol.say("Hi")
}

open class Mom(nativeTongue: String) {
    open val hairColor = "Brown"
    val eyeColor = "Blue"

    open fun say(message: String) {
        println("Mom says $message")
    }
}

class Daughter(nativeTongue: String) : Mom(nativeTongue) {
    override val hairColor: String = "Blonde"

    override fun say(message: String) {
        println("Daughter says $message")
        super.say(message)
        println("Mother has ${super.hairColor}")
    }
}