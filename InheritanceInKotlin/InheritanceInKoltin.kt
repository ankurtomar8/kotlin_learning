package InheritanceInKotlin

open class Person {
   // fun validate(){   /// by Default class in Kotlin are final
    open fun validate(){   // Open keyword is used
    }

}

class Customer: Person {
    override fun validate(){
    }

    constructor(): super(){   // Supertype initialization is impossible

    }
}

class SpecialCustomer: Person(){
    override fun validate() {
        super.validate()
    }
}

fun main(){
    val customer = Customer() // Creating Instance of Customer class
    customer.validate()
    println(customer)
}