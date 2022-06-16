fun main() {
    val customers = mutableListOf<Customer>()
    customers.add(Customer("Alice", "mail", 7))
    customers.add(Customer("Harold", "mail2", 8))
    customers.add(Customer("Andy", "mail3", 75))
    println(customers)

    val newCustomer = customers[1].copy(email = "harold@example.com")
    println(newCustomer)
    customers.add(newCustomer)
    println(customers)

    sendEmail(customers)
}

fun sendEmail(customers: MutableList<Customer>) {
    for (customer in customers) {
        println("Sending email to ${customer.email}")
    }
}

data class Customer(
    val name: String,
    val email: String,
    val productsBought: Int
)