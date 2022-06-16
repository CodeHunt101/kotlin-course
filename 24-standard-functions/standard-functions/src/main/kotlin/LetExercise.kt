fun main() {
    val clientNames = mutableListOf<String?>()

    while (true) {
        println("Enter client name")
        val input: String? = readLine()

        if (input == "stop")
            break
        if (input != "") clientNames.add(input) else clientNames.add(null)
    }

    clientNames.forEach {
        it?.let { println("Hi $it") }
    }

}