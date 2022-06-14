fun main() {
    val jet1 = Jetpack()
    println(jet1.burn(6))
    println(jet1.stop(3))
}

class Jetpack {
    private var userHeight: Int = 0
    fun burn(seconds: Int): String {
        userHeight += (1 * seconds)
        return "New height is $userHeight"
    }

    fun stop(seconds: Int): String {
        if ((userHeight - (3 * seconds)) < 0) {
            userHeight = 0
            return "User cannot go below 0. New height is 0"
        }
        userHeight -= (3 * seconds)
        return "New height is $userHeight"
    }
}