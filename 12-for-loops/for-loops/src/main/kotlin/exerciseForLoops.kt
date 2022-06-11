fun main() {
    println("Input a year: ")
    val year = readLine()?.toInt()

    val yearType: String = if (year?.rem(4) != 0) {
        "Common year"
    } else if (year % 100 != 0) {
        "Leap year"
    } else if (year % 400 != 0) {
        "Common year"
    } else {
        "Leap year"
    }

    println(yearType)

    val months = mapOf(
        "Jan" to 31,
        "Feb" to if (yearType == "Common year") 28 else 29,
        "Mar" to 31,
        "Apr" to 30,
        "May" to 31,
        "Jun" to 30,
        "Jul" to 31,
        "Aug" to 31,
        "Sep" to 30,
        "Oct" to 31,
        "Nov" to 30,
        "Dec" to 31
    )
    println("This is a $yearType")
    for (month in months) {
        println("${month.key}: ${month.value} days")
        println("")
    }
}