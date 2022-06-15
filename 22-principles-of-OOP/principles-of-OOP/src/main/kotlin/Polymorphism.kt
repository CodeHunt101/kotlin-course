fun main() {
    val child = Child()
    child.say("love you mum")
    child.say()

    val mum = Mum()
    mum.say("love you son")
    mum.say(3)
}

//Polymorphism - method overriding

open class Mum {
    //    method overriding
    open fun say(message: String) {
        println("mom says $message")
    }

    //    method overloading
    fun say() {
        println("hey child")
    }

    fun say(times: Int) {
        for (i in 1..times) println("mom says love child")
    }

    fun say(message: String, times: Int) {
        for (i in 1..times) println("mom says $message")
    }
}

class Child : Mum() {
    override fun say(message: String) {
        println("child says $message")
    }
}