fun main() {
    var flight: Plane = Airline().takeEconomicClass()
    flight.transport()

    flight = Airline().takeBusinessClass()
    flight.transport()
}

interface Plane {
    fun transport()
}

class EconomicClass : Plane {
    override fun transport() {
        println("Take passenger to the destination")
    }
}

class BusinessClass : Plane {
    override fun transport() {
        println("Take passenger to the destination and comfortably")
    }
}

class Airline {
    fun takeEconomicClass(): Plane {
        println("Price for Economic Class: $100 ")
        return EconomicClass()
    }

    fun takeBusinessClass(): Plane {
        println("Price for Economic Class: $500 ")
        return BusinessClass()
    }
}