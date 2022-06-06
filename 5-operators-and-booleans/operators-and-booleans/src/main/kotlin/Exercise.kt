import kotlin.math.pow

fun main() {
    val interest = 0.05
    println("Enter your current balance")

    val balanceString = readLine()?:"0"
    val balance = balanceString.toDouble()
    val years = 5

    val result = balance * (interest + 1).pow(years)
    println(result)
}