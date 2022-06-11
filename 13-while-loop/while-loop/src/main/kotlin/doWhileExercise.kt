fun main() {
    println("Enter a number")
    val input = readLine()?:""
    val number = input.toInt()

    var factorial = 2
    var counter = factorial+1
    while (counter <= number) {
        factorial *= counter
        counter++
    }
    while (factorial < 3000000) {
        println("Result $factorial is less than 3000000, try again")
        return main()
    }
    println(factorial)
}