fun main() {
    mutableListOf("harold", "siri").numberOfElements()
}

fun MutableList<String>.numberOfElements() = println("This array contains ${this.size} elements")