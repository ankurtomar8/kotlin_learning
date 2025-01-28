package functional

import InheritanceInKotlin.Customer

fun String.hello(){
    println("It's me!")
}

fun String.toTitleCase(): String{
    return this.split("").joinToString(""){it.capitalize()}
}

fun main(){
    val string = "Another one"
    string.hello() // String Inheritance Exetnsion function
    "Hello".hello()  // It's me!
    println("This is a sample string to Title Case it".toTitleCase())

    // Customer Instance
    val customer = Customer()
    customer.makePreferred()

    val instance : BaseClass = InheritedClass()
    instance.extension() // Base Extension

    val instance2  = InheritedClass()
    instance2.extension() // Inherited  Extension
}
class Customer {
    fun makePreferred() {
        println("Customer version")
    }
}

fun Customer.makePreferred(){
    println("Extended version")
}

open class BaseClass
class InheritedClass: BaseClass()

fun BaseClass.extension(){
    println("Base Extension")
}

fun InheritedClass.extension(){
    println("Inherited extension")
}