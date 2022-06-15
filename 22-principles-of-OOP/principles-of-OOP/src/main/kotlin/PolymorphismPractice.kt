fun main() {
    val translator = Translator()
    translator.printMessage()
    translator.printMessage("es")
    translator.printMessage("fr")
}

class Translator {
    fun printMessage() {
        println("Hello")
    }

    fun printMessage(language: String) {
        when (language) {
            "fr" -> println("Bonjour")
            "es" -> println("Hola")
            else -> println("Hello")
        }
    }
}