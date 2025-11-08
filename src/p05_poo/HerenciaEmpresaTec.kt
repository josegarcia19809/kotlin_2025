package p05_poo

// Clase Base
open class Empleado(val departamento: String) {
    open val puesto = "Empleado general"
    val horario = "9:00 a 17:00"
    open fun trabajar(tarea: String) {
        println("👨🏼‍💼 $puesto realiza la tarea: $tarea 💼")
    }
}

// 🧑‍💻 Subclase Programador
class Programador(departamento: String) : Empleado(departamento) {
    override val puesto = "Desarrollador de Software"
    override fun trabajar(tarea: String) {
        println("💻 El programador está codificando $tarea")
        super.trabajar(tarea)
        println("⏱️ Horario base: ${super.horario}")
    }
}

// 👩‍💼 Subclase Gerente
class Gerente(departamento: String) : Empleado(departamento) {
    override val puesto = "Gerente de proyecto"
    override fun trabajar(tarea: String) {
        println("📋 El gerente está coordinando: $tarea")
        super.trabajar(tarea)
        println("✅ Verificando progreso del equipo...")
    }
}


// 🧠 Uso del programa
fun main() {
    val ana = Programador("Desarrollo")
    println("🔹 Puesto: ${ana.puesto}")
    ana.trabajar("módulo de autenticación")

    println("-".repeat(100))

    val laura = Gerente("Desarrollo")
    println("🔹 Puesto: ${laura.puesto}")
    laura.trabajar("entrega del sprint")
}

