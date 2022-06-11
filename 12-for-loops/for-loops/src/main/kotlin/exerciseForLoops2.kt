fun main() {
    println("Enter a number: ")
    val number = readLine() ?: ""
    val matrixSize = number.toInt()

    for (row in 1..matrixSize)
        for (column in 1..matrixSize) {
            val emoji = when ((row * column) % 3) {
                0 -> "😀"
                1 -> "🤨"
                2 -> "😱"
                else -> "$row,$column"
            }
            if (column < matrixSize) print("$emoji\t") else println(emoji)
        }
}