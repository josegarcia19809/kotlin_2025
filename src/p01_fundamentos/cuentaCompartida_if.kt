package p01_fundamentos

// cuentaCompartida
/*
* Calcular lo que debe pagar cada persona en una cuenta
* compartida, si el número de personas es cero, mostrar
* un mensaje de error (no se puede dividir entre cero)
*
* */
fun main() {
    // Leer el total a pagar
    print("Total a pagar: $")
    val total = readln().toDouble()

    // Leer el número de personas
    print("Número de personas: ")
    val personas = readln().toInt()

    // Comprobar si se puede dividir la cuenta
    if (personas == 0) {
        println("❌ No se puede dividir entre cero")
    } else {
        val totalAPagar = total / personas;
        println("✅ Cada persona debe pagar $totalAPagar")
    }
}