fun main() {
    val tv = TV()
    tv.getChannel("5")
    tv.getChannel("7", true)
    tv.getChannel("2", "12:00")
}

class TV {
    fun getChannel(id: String) {
        println("Regular broadcast for channel $id")
    }

    fun getChannel(id: String, subtitles: Boolean) {
        println("Regular broadcast for channel $id")
        if (subtitles) println("With subs") else println("No subs")
    }

    fun getChannel(id: String, time: String) {
        println("Broadcast for channel $id at $time time")
    }
}