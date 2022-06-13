import java.util.*
import kotlin.random.Random

val words = listOf(
    "laptop",
    "software",
    "table",
    "phone",
    "book",
    "extraordinary",
    "noodles",
    "happy",
    "android",
    "retrospective"
)
var word = ""
val guesses = mutableListOf<Char>()
var remainingGuesses = 6
var mistakes = 0

fun main() {
    setupGame()
}

fun setupGame() {
    val wordIndex = Random.nextInt(words.size)
    word = words[wordIndex].uppercase(Locale.getDefault())
    println(word)

    for (i in word.indices)
        guesses.add('_')

    var gameOver = false

    do {
        printGameStatus()
        println("Please enter a letter:")
        val input = readLine()?:""

        if (input.isEmpty()) {
            println("That's not a valid input. Try again")
        } else {
            val letter = input[0].uppercaseChar()
            if (word.contains(letter)) {
                for (i in word.indices) {
                    if (word[i] == letter)
                        guesses[i] = letter
                }
                if (!guesses.contains('_'))
                    gameOver = true
            } else {
                println("Sorry, that's not part of the word")
                remainingGuesses--
                mistakes++
                if (mistakes == 6) gameOver = true
            }
        }
    } while (!gameOver)

    if (mistakes == 6) {
        printGameStatus()
        println("Loser! The word was \n$word")
    } else {
        println("Winner! Congrats! You guesses the word \n$word")
    }
}

fun printGameStatus() {
    when (mistakes) {
        0->print0Mistakes()
        1->print1Mistake()
        2->print2Mistakes()
        3->print3Mistakes()
        4->print4Mistakes()
        5->print5Mistakes()
        6->print6Mistakes()
    }

    print("Word: ")
    for (element: Char in guesses)
        print("$element ")
    println("\nYou have $remainingGuesses guess(es) left")
}

fun print0Mistakes() {
    println("  |------|-")
    println("  |      | ")
    println("  |        ")
    println("  |        ")
    println("  |        ")
    println("  |        ")
    println(" /|\\      ")
    println("/ | \\     ")
}

fun print1Mistake() {
    println("  |------|-")
    println("  |      | ")
    println("  |      o ")
    println("  |        ")
    println("  |        ")
    println("  |        ")
    println(" /|\\      ")
    println("/ | \\     ")
}

fun print2Mistakes() {
    println("  |------|-")
    println("  |      | ")
    println("  |      o ")
    println("  |      | ")
    println("  |      | ")
    println("  |        ")
    println(" /|\\      ")
    println("/ | \\     ")
}

fun print3Mistakes() {
    println("  |------|-")
    println("  |      | ")
    println("  |      o ")
    println("  |     /| ")
    println("  |      | ")
    println("  |        ")
    println(" /|\\      ")
    println("/ | \\     ")
}

fun print4Mistakes() {
    println("  |------|-")
    println("  |      | ")
    println("  |      o ")
    println("  |     /|\\")
    println("  |      | ")
    println("  |        ")
    println(" /|\\      ")
    println("/ | \\     ")
}

fun print5Mistakes() {
    println("  |------|-")
    println("  |      | ")
    println("  |      o ")
    println("  |     /|\\")
    println("  |      | ")
    println("  |     /  ")
    println(" /|\\      ")
    println("/ | \\     ")
}

fun print6Mistakes() {
    println("  |------|-")
    println("  |      | ")
    println("  |      o ")
    println("  |     /|\\")
    println("  |      | ")
    println("  |     / \\")
    println(" /|\\      ")
    println("/ | \\     ")
}