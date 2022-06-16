fun main() {
    println("Input a number")

    val input = readLine()

    input?.let {
        val number = it.toInt()
        println("Double is ${number * 2}")
    }

    val animals = mutableListOf<String?>()

    for (i in 1..3) {
        println("Input an animal")

        val input2 = readLine()
        input2?.let {
            if (it == "") {
                animals.add(null)
            } else {
                animals.add(it)
            }
        }
    }

    animals.forEach {
        it?.let {
            println("Feeding the $it")
        }

    }
}

