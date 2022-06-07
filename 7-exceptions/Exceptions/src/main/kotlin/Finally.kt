fun main() {
    val test = readLine()

    try {
        println(test?.toInt())
    } catch(e: Exception) {
        e.printStackTrace()
        println("An exception happened \n ${e.localizedMessage}")
    } finally {
        println("The execution has completed")
    }
}

//Finally is used to free up resources after the code has been executed