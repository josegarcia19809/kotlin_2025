package p07_other_classes

import p04_funciones.imprimirLinea

data class Customer(
    val name: String,
    val email: String,
    val productsBought: Int
)

fun main() {
    val customers = arrayListOf<Customer>()
    customers.add(Customer("Alice", "alice@gmail.com", 7))
    customers.add(Customer("Bob", "bob@gmail.com", 7))
    customers.add(Customer("Carol", "carol@gmail.com", 7))
    printCustomers(customers)
    imprimirLinea()

    val newCustomer = customers[1].copy(email = "bobs_new_email@gmail.com")
    customers.add(newCustomer)
    printCustomers(customers)
    imprimirLinea()
    sendEmail(customers)
}

fun sendEmail(customers: ArrayList<Customer>) {
    customers.forEach {
        println("Sending a email to ${it.email}")
    }
}

fun printCustomers(customers: ArrayList<Customer>) {
    customers.forEach {
        println(it)
    }
}