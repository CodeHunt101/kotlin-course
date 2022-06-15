fun main() {
    val rest1: Restaurant = LocalRestaurant()
    rest1.food()
    rest1.bill()

    val rest2: Restaurant = FancierRestaurant()
    rest2.food()
    rest2.bill()
}

interface Restaurant {
    fun food()
    fun bill()
}

class LocalRestaurant : Restaurant {
    override fun food() {
        println("Take your normal food")
    }

    override fun bill() {
        println("Take your cheap bill")
    }
}

class FancierRestaurant : Restaurant {
    override fun food() {
        println("Take your fancy food")
    }

    override fun bill() {
        println("Take your expensive bill")
    }
}