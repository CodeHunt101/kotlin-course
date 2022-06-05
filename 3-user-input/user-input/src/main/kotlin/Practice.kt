fun main() {
    println("What is your name?")
    val username = readLine()
    println("Welcome, $username")

    println("Please enter a number")
    val number = readLine()?:""
    val result = number.toInt() * 5
    println("$number * 5 = $result")

    println("Please enter your birth year")
    val year = readLine()?:""
    println("You are ${2022 - year.toInt()} years old")

}