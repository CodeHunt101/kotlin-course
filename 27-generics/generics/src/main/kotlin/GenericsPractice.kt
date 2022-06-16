fun main() {
    val info = Info<Int>()
    info.getLength(12345)

    val info2 = Info<Double>()
    info2.getLength(30.28)

    val info3 = Info<MutableList<String>>()
    info3.getLength(mutableListOf("harold", "siri"))
}

class Info<T> {
    fun getLength(item: T) {
        println(item.toString().length)
    }
}