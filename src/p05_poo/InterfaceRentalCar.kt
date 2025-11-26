package p05_poo

interface RentalCar {
    var price: Double
    fun rent()
}

class AffordableCar : RentalCar {
    override var price: Double = 1000.0
    override fun rent() {
        println("The affordable car costs $price")
    }
}

class LuxuryCar : RentalCar {
    override var price: Double = 5000.0
    override fun rent() {
        println("The luxury car costs $price")
    }
}

class CarDealer {
    fun rentAffordableCar(): RentalCar {
        return AffordableCar()
    }

    fun rentLuxuryCar(): RentalCar {
        return LuxuryCar()
    }
}

fun main() {

    val dealer = CarDealer()
    var myCar = dealer.rentAffordableCar()
    myCar.rent()

    myCar = dealer.rentLuxuryCar()
    myCar.rent()
}
