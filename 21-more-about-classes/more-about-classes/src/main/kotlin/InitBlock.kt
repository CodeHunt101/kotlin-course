fun main() {
    val plane = Plane()
}

class Plane() {
    private var model:String = "BMW"
    private val topSpeed:Int = 100

    init {
        println("This plane is a $model and has a top speed of $topSpeed")
    }
}