package p01_fundamentos

fun main() {
    println("Tienda 'La Comercial'")
    print("Dame cantidad de refrescos vendidos: ")
    val cantidad = readln().toInt();

    print("Dame el costo por refresco: ")
    val precioRefresco = readln().toDouble()

    println("La venta total es ${cantidad * precioRefresco}")
}