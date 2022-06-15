fun main() {
    val maccas = Franchise()
    maccas.prepareBurgers()
}

open class FastFoodCompany {
    protected fun applyFormula(): String {
        return "Prepare burger with love and care"
    }
}

class Franchise : FastFoodCompany() {
    fun prepareBurgers() {
        println("Preparing burgers according to the secret formula")
        println(applyFormula())
    }
}