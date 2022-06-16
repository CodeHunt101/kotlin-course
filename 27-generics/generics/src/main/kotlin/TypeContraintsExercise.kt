fun main() {
    val circle = Geometry<Circle>()
    circle.printArea(Circle(), 5)

    val square = Geometry<Square>()
    square.printArea(Square(), 5)
}

abstract class Shape {
    abstract fun getArea(size: Int): Double
}

class Square : Shape() {
    override fun getArea(size: Int): Double {
        return (size * size).toDouble()
    }
}

class Circle : Shape() {
    override fun getArea(size: Int): Double {
        return (size * size) * 3.1415
    }
}

class Geometry<T : Shape> {
    fun printArea(shape: T, size: Int) {
        println("The area of this shape is ${shape.getArea(size)}")
    }
}