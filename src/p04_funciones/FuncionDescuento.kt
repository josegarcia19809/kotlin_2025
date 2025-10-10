package p04_funciones

/*
* precio $1000, porcentajeDescuento 25 -> $250.00
* calcularDescuento(1000, 25) => "El descuento es de 250 pesos"
* */

fun calcularDescuento(precio: Double, porcentajeDescuento: Int) {
    val descuento = precio * (porcentajeDescuento / 100.0)
    println("El descuento de este producto es de $${String.format("%.2f", descuento)}")
    println("El descuento de este producto es de $%.2f".format(descuento))
}

fun main() {
    calcularDescuento(1000.00, 25)
}