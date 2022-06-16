fun main() {
    val banned = mutableListOf<String>("harold", "siri", "")
    val newUser: NewUser by lazy {
        NewUser()
    }

    println("Input your username:")
    val input = readln()

    if (!banned.contains(input)) {
        newUser.welcome(input)
    }
}

class NewUser {
    fun welcome(username: String) {
        println("Welcome $username")
    }
}