fun main() {
    val foo = Foo<Int>()
    val bar = Foo<String>()

    foo.convert(12)
    bar.convert("siri")
}

class Foo<T> {
    fun convert(item: T) {
        println("I am returning the argument $item")
    }
}