fun main() {
    val chair = Chair()
    chair.adjustHeight(80)
    chair.adjustSize("Large")
}

class Chair {
    private var height = 20
    private var size = "Medium"

    fun adjustHeight(height:Int) {
        println("Current height is ${this.height}")
        this.height = height
        println("New height is $height")
    }

    fun adjustSize(size:String) {
        println("Current height is ${this.size}")
        this.size = size
        println("New size is $size")
    }
}