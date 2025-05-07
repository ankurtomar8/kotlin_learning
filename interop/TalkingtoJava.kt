package interop

fun main(){
    val  customer = CustomerJava()

    customer.email = "mail@ankurtomar.com"

    customer.prettyPrint() // Calling Java Method from Kotlin Class
    customer.neverNull()
    customer.sometimesNull()

//    TopLevelFunntionsKt.prefix("some","value")

    val runnable = Runnable { println("Invoking runnable") }

    val kr = KotlinCustomerRepo()

    val customerJava = kr.getById(10)

    customerJava.id
}

class  PersonKotlin: PersonJava(){

}

class KotlinCustomerRepo: CustomerRepository{
    fun getById(id: Int): CustomerJava {
        TODO("Not yet implemented")
    }

    fun getAll(): MutableList<CustomerJava> {
        TODO("Not yet implemented")
    }
}

class RunnableKotlin:Runnable {
    override fun run() {  /// Better way to do above mentioned in comment
        TODO("Not yet implemented")
    }
}