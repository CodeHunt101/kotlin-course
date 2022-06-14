fun main() {
    val bank = Bank()
    println(bank.balance)
    bank.balance = 500
    bank.balance = 8000
    bank.balance = 5000000
}

class Bank {
    private var interestRate: Double? = null
    var balance: Int = 0
        set(value) {
            interestRate = if (value < 1000)
                1.0
            else if (value < 10000)
                0.5
            else 0.2
            field = value
            println("The user's balance was $balance and it's now $value with an interest rate of $interestRate")
        }
}