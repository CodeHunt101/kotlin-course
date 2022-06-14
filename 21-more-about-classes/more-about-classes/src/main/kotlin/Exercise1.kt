fun main() {
    val account1 = UserAccount("Harold", 40.0)
    val account2 = UserAccount("Siri")
    val account3 = UserAccount()
}

class UserAccount {
    constructor() {
        userName = "Not assigned"
        balance = 0.0
        canAffordShirt()
    }

    constructor(newName: String) {
        userName = newName
        balance = 30.0
        canAffordShirt()
    }

    constructor(newName: String, newBalance: Double) {
        userName = newName
        balance = if (newBalance < 0.0) 0.0 else newBalance
        canAffordShirt()

    }

    private fun canAffordShirt() {
        if (balance < 20.0) {
            println("This user cannot buy shirts")
        } else {
            println("This user can buy ${balance.toInt() / 20} shirt(s)")
        }
    }

    private var userName: String? = null
    private var balance: Double = 0.0
}