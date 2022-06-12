fun main() {
    println(sendMessage(mutableListOf("Harold", "Siri", "Hernando"))
    { name -> "Hi $name" })
}

fun sendMessage(clientNames: MutableList<String>, lbd: (String) -> String): MutableList<String> {
    for (index in 0 until clientNames.size) {
        clientNames[index] = lbd(clientNames[index])
    }
    return clientNames
}