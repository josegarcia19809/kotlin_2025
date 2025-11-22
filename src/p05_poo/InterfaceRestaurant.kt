package p05_poo

import p04_funciones.imprimirLinea

interface Restaurant {
    fun provideFood()
    fun provideBill()
}

class LocalRestaurant : Restaurant {
    override fun provideFood() {
        println("Your Local Restaurant provides food and drinks")
    }

    override fun provideBill() {
        println("Please py 25")
    }
}

class FancyRestaurant : Restaurant {
    override fun provideFood() {
        println("This is the most delicious food I have ever tried")
    }

    override fun provideBill() {
        println("Please py 100")
    }
}

fun main() {
    val local = LocalRestaurant()
    local.provideFood()
    local.provideBill()
    imprimirLinea()

    val fancy = FancyRestaurant()
    fancy.provideFood()
    fancy.provideBill()
}