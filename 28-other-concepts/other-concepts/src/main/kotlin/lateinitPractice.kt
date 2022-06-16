fun main() {
    val country = Country()
    country.giveName("Australia")
    println(country.returnName())
}

class Country {
    private lateinit var name: String

    fun giveName(name:String) {
        this.name = name
    }

    fun returnName():String {
        return name
    }
}