fun main() {
    val cats = 3
    val longCats = cats.toLong()

    println(cats::class.java)
    println(longCats::class.java)
    println(longCats)


    val people = 7500000000
    val fewPeople = people.toInt() //will be corrupted as long won't fit in int

    println(fewPeople::class.java)
    println(fewPeople)
}