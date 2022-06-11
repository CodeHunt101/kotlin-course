fun main() {
    /* A group of young people are going to a nightclub.
    Design a program that accepts user ages.
    The program displays a welcome message for each user.
    If it receives an age lower than 18, it prints a message that this client is not allowed.
    If it receives the word “stop”, the program ends */

    while (true) {
        print("Please enter your age: ")
        val ageInput = readLine() ?: ""
        if (ageInput == "stop") break
        if (ageInput.toInt() < 18) {
            println("This client is not allowed")
            continue
        }
        println("Welcome user")
    }
}