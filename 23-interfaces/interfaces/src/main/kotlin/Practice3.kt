fun main() {
    var myFood: Food = FastFoodRestaurant().buyFood()
    myFood.eat()

    myFood = FrenchFoodRestaurant().todaySpecial()
    myFood.eat()
}

interface Food {
    fun eat()
}

class FastFood : Food {
    override fun eat() {
        println("Fast foot will feed you")
    }
}

class FrenchFood : Food {
    override fun eat() {
        println("French foot will delight you")
    }
}

class FastFoodRestaurant {
    fun buyFood(): Food {
        return FastFood()
    }
}

class FrenchFoodRestaurant {
    fun todaySpecial(): Food {
        return FrenchFood()
    }
}