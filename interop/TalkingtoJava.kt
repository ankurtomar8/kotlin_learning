package interop

import CustomerJava

fun main(){
    val  customer = CustomerJava()

    customer.email = "mail@ankurtomar.com"

    customer.prettyPrint() // Calling Java Method from Kotlin Class

    val runnable = Runnable { println("Invoking runnable") }
}

class  PersonKotlin: PersonJava(){

}

class KotlinCustomerRepo: CustomerRepository{
    override fun getById(id: Int): CustomerJava {
        TODO("Not yet implemented")
    }

    override fun getAll(): MutableList<CustomerJava> {
        TODO("Not yet implemented")
    }
}

class RunnableKotlin:Runnable {
    override fun run() {  /// Better way to do above mentioned in comment
        TODO("Not yet implemented")
    }
}