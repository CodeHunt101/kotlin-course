fun main() {
    val printer1 = Printer<Set<String>>()
    printer1.iterate(mutableSetOf("Alice", "Harold", "Mono"))

    val printer2 = Printer<List<String>>()
    printer2.iterate(listOf("Dan", "Tan", "Laurie"))
}

class Printer<T : Collection<String>> {
    fun iterate(collection: T) {
        collection.forEach { println(it.toString()) }
    }
}