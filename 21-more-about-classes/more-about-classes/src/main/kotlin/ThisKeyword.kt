fun main() {
    val note = PostItNote()
    println(note.message)
    note.updateMessage("Meeting at 4")
    println(note.message)
    note.printMessage()
}

class PostItNote {
    var message:String = "No message"

    fun updateMessage(message:String) {
        this.message = message
    }

    fun printMessage() {
        println(this.message)
    }
}