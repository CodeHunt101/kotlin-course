fun main() {
    val clients = listOf("Anna", "Bob", "Carol", "Dan")

    clients.forEach { println("Hello $it") }

    clients.filter { it.length < 5 }.forEach { println("Hey $it") }

    val clientSizes = clients.map { it.length }
    println(clientSizes)

    val sorted = clients.sortedBy { it.length }
    println(sorted)

    val largestName = clients.maxByOrNull { it.length }
    println(largestName)

    val shortestName = clients.minByOrNull { it.length }
    println(shortestName)
}