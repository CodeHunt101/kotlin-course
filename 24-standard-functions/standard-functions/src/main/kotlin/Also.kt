fun main() {
    Book().apply {
        printBook()
    }.also {
        println("Printing book $it")
        println("Sending email")
    }
}

class Book {
    fun printBook() {
        println("Printing book")
    }
}