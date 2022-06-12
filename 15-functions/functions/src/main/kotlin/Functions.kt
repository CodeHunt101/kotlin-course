fun main() {
    for (i in 1..3) {
        displayUserInfo()
    }

    println("Please enter animal")
    val animalInput = readLine() ?: ""
    estimateAnimalLifespan(animalInput)
}

/*Design a function that asks for a user’s name. Then it asks for a user’s birth year.
Finally, it prints out a message saying the user’s name and age.
Call the function 3 times.*/

fun displayUserInfo() {
    println("Enter your name: ")
    val name = readLine() ?: ""

    println("Enter your birth year: ")
    val birthYearInput = readLine() ?: ""
    val birthYear = birthYearInput.toInt()

    println("Name: $name, Age: ${2022 - birthYear} years old")
}

/*Create a function that receives the name of an animal, and returns the estimated lifespan.
cats -> 15
dogs -> 10
rabbit -> 12
everything else -> 20
Ask the user to input an animal, then print out the estimated lifespan for that animal. */

fun estimateAnimalLifespan(animal: String) {
    val animalLifespans = mapOf(
        "cats" to 15,
        "dogs" to 10,
        "rabbit" to 12,
    )
//
    if (animalLifespans[animal] == null) println(20) else println(animalLifespans[animal])
}