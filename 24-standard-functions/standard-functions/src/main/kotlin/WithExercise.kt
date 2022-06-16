fun main() {
    with(Store()) {
        shoes = 15
        shirts = 50
        inventory()
        println("Hello")
    }
}

class Store {
    var shoes = 10
    var shirts = 500
    var jackets = 60

    fun inventory() {
        println("There are $shoes shoes, $shirts shirts and $jackets jackets")
    }
}