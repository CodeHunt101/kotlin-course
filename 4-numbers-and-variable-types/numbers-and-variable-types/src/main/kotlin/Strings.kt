fun main() {
    val cats = 3
    println(cats::class.java)

    val catsString = cats.toString()
    println(catsString::class.java)

    val pi = 3.14159
    println(pi::class.java)
    val piString = pi.toString()
    println(piString::class.java)

//    Exercises

    println("Please enter a number:")

    val number = readLine()?:"0"
    val numberDouble = number.toDouble()

    val result = numberDouble * pi
    println("Result is $result of type ${result::class.java}")
/*
val numberInput = readLine()?:"0"

val myByte = numberInput.toByte()
println(myByte)
println(myByte::class.java)

val myShort = myByte.toShort()
println(myShort::class.java)
*/


}