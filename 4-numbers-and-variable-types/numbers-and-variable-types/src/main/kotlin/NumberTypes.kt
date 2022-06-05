fun main() {
    val items = 5
    println(items::class.java)

    val nbOfPeople = 7500000000
    println(nbOfPeople::class.java)

    val price = 29.99
    println(price::class.java)

    val pi = 3.1415974444738484
    println(pi::class.java)

    val bacteriaGrowthRate = 1.234543F
    println(bacteriaGrowthRate::class.java)

//    Exercise
    print("Enter a number: ")
    val number = readLine()?:""
    val multiplier = 5.25
    val result = number.toInt() * multiplier
    val varType = result::class.java

    println("The result is $result of type $varType")
}