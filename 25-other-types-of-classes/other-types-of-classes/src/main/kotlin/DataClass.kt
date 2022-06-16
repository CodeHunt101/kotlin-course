// Commonly create classes just for storing data

fun main() {
    val myUser = User("Harold", "harold@example.com", "password")
    println(myUser) //equivalent to  println(myUser.toString())

    val myUser2 = User("Harold", "harold@example.com", "password")
    println(myUser == myUser2)

    val myUser3 = myUser2.copy(email = "harold@mail.com")
    println(myUser3)
    println(myUser3 == myUser2)


}

// Needs at least 1 constructor parameter
data class User(
    val name: String,
    val email: String,
    val password: String
)