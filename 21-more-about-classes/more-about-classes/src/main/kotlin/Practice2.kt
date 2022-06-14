fun main() {
    val account = BankAccount()
    account.account = 300
    account.account = 400
    account.account = 100

    println(account.account)
}

class BankAccount {
    private var creditRating = 500
    var account: Int = 0
        set(value) {
            if (value > account) {
                creditRating++
            } else creditRating--
            println("New credit rating is $creditRating")
            field = value
        }
}