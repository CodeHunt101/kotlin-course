fun main() {
    lateinit var message:String

    val primes = listOf(2, 3, 5, 7, 11, 13, 17, 19, 23)

    fun returnPrime(primes:List<Int>):String {
        message = "The randomly generated prime number is ${primes.random()}"
        return message
    }

    println(returnPrime(primes))
}