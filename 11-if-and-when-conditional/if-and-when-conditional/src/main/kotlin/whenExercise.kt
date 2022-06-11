fun main() {
    println("Enter your name: ")
    val name = readLine()?:""

    val greeting = when (name[0].uppercaseChar()) {
        in 'A'..'C' -> "hi my friend"
        in 'D'..'F' -> "welcome buddy"
        else -> "hello darling"
    }

    println(greeting)
}