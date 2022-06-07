fun main() {
//    println("please enter a number")
//    val input = readLine()
//    try {
//        val number = input?.toInt()
//        println("$number * 5 = ${number?.times(5)}")
//    } catch(e: Exception) {
//        println("The value '$input' is not a number")
//        e.printStackTrace()
//    }

    println("Please enter the distance in km")
    val input = readLine()
    try {
        val distanceKm = input?.toDouble()
        println("$distanceKm km is ${distanceKm?.times(0.62)} miles")
    } catch (e: Exception) {
        println("Cannot read distance")
        e.printStackTrace()
    }

}