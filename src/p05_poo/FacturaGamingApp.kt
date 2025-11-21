package p05_poo

class FacturaGaming(private val plan: Int, private val horasJugadas: Int) {

    fun calcularPago(): Double {
        var pago = 0.0

        when (plan) {
            1 -> {
                pago = 150.0
                if (horasJugadas > 15) {
                    val extra = horasJugadas - 15
                    pago += extra * 10
                }
            }
            2 -> {
                pago = 220.0
                if (horasJugadas > 25) {
                    val extra = horasJugadas - 25
                    pago += extra * 8
                }
            }
            3 -> {
                pago = 300.0
                if (horasJugadas > 40) {
                    val extra = horasJugadas - 40
                    pago += extra * 6
                }
            }
        }
        return pago
    }
}

fun main() {
    val idUsuario = 11
    val plan = (idUsuario % 3) + 1
    val horas = idUsuario * 5

    val factura = FacturaGaming(plan, horas)
    val total = factura.calcularPago()

    println("Usuario $idUsuario")
    println("Plan asignado: $plan")
    println("Horas jugadas: $horas")
    println("Total a pagar: $$total MXN")
}
