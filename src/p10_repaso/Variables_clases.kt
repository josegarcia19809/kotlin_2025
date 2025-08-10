package p10_repaso

typealias EmployeeSet = Set<Employee>


fun main() {
    val names = arrayListOf("John", "Denise", "Jane", "Paul")
    println("Lista de nombres: ${names.joinToString()}")
    println("Segundo nombre en la lista: ${names[1]}")

    val employees: EmployeeSet = setOf()
    println("Conjunto vacío de empleados: ${employees.joinToString()}")

    val employee1 = Employee("John", 500)
    println("Empleado 1 antes del cambio: ${employee1}")
    employee1.name = "Jane"
    println("Empleado 1 después del cambio: ${employee1}")

    /*
    * 3️⃣ Comparaciones
        Kotlin distingue dos tipos de comparaciones:

        🔹 Igualdad referencial (=== y !==)
        === → ¿Apuntan a la misma dirección de memoria?

        !== → ¿Apuntan a diferente dirección de memoria?

        🔹 Igualdad estructural (== y !=)
        == llama internamente a equals() para comparar contenido.

        != es lo contrario.
    * */
    val employeeOne = Employee("Mary", 1)
    val employeeTwo = Employee("John", 2)
    val employeeThree = Employee("John", 2)

    println("-".repeat(100))
    println("employeeOne === employeeTwo: ${employeeOne === employeeTwo}") // false → Diferentes objetos.
    println("employeeTwo === employeeThree: ${employeeTwo === employeeThree}") // false → Aunque tienen mismos datos, son instancias distintas.
    println("employeeOne == employeeTwo: ${employeeOne == employeeTwo}") // false → equals() compara datos → Mary != John.
    println("employeeTwo == employeeThree: ${employeeTwo == employeeThree}") // true → equals() compara datos → John/2 == John/2.

    val employeeFour = employeeTwo
    println("employeeFour === employeeTwo: ${employeeFour === employeeTwo}") // true → Mismo objeto (misma referencia).

    println("employeeFour != employeeTwo: ${employeeFour != employeeTwo}") // false → equals() dice que son iguales.
    println("employeeFour !== employeeTwo: ${employeeFour !== employeeTwo}") // false → Misma referencia.
    println("employeeTwo != employeeThree: ${employeeTwo != employeeThree}") // false → equals() dice que son iguales.
    println("employeeTwo !== employeeThree: ${employeeTwo !== employeeThree}") // true → Referencias distintas.
    

}


class Employee(var name: String, val id: Int) {
    override fun equals(other: Any?): Boolean {
        if (other is Employee) {
            return this.name == other.name && id == other.id
        }
        return false
    }

    override fun toString(): String {
        return "Employee(name='$name', id=$id)"
    }
}