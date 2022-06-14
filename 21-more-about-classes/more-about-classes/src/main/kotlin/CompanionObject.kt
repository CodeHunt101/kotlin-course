fun main() {
    println(Boat.getNavigatingInstructions())
    println(Boat.size)
}

class Boat() {
    companion object {
        fun getNavigatingInstructions():String {
            return "Be careful"
        }

        const val size = 10
    }
}