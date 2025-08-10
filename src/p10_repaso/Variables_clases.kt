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
}


class Employee(var name: String, val id: Int) {
    override fun toString(): String {
        return "Employee(name='$name', id=$id)"
    }
}