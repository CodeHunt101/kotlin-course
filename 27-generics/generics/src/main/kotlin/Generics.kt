fun main() {
    val myBox = Box<String>()
    myBox.display("Contents")

    val carBox = Box<Car>()
    carBox.display(Car())

    val myBox2 = MyBox<Int, String>()
    myBox2.display(1, "2")
}

class Box<T> {
    fun display(item: T) {
        println(item)
    }
}

class MyBox<T, U> {
    fun display(item: T, item2: U) {
        println(item)
        println(item2)
    }
}

class Car