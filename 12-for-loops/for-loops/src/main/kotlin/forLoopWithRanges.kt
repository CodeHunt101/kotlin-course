fun main() {
    for (i in 10 downTo 0) {
        println(i)
        when (i) {
            9 -> println("Start your engine")
            6 -> println("On your marks")
            3 -> println("Get set")
            0 -> println("GO!")
        }
    }

    for (i in 10 downTo 0 step 3) {
        println(i)
    }
}