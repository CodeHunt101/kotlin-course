fun main() {
    greet(5, "Harold", "Siri")
}

fun greet(count: Int, vararg clientNames: String) {
    for (clientName in clientNames) for (i in 1..count)
        println("Hello, $clientName")
}