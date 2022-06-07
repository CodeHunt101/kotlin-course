fun main() {
    val test = readLine()

    try {
        println(test?.toInt())
    } catch(e: Exception) {
        e.printStackTrace()
        println("An exception happened \n ${e.localizedMessage}")
    }
}