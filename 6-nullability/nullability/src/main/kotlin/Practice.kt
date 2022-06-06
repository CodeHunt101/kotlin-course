fun main() {
    var a: String? = "I like dogs"
    println(a?.substring(3,6))

    var b: Double? = 13.94
    b = b?.times(6)

    println(b?.toFloat())

//    var username = readLine()
//    println(username?.length)

    var number = readLine()
    var numberDouble = number?.toDouble()

    var stringTimes7 = numberDouble?.times(7)?.toString()

    println(stringTimes7)
}