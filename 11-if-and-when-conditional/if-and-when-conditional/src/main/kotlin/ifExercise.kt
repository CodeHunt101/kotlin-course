fun main() {
    println("Enter student's grade:")
    val score:Int? = readLine()?.toInt()

    val grade = if (score in 90..100)
        'A'
    else if (score in 80..89)
        'B'
    else if (score in 70..79)
        'C'
    else if (score in 60..69)
        'D'
    else if (score in 50..59)
        'E'
    else
        'F'

    println(grade)
}