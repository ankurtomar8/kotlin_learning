package InheritanceInKotlin

import kotlin.jvm.internal.Ref.BooleanRef

interface InterfacesInKotlin{
    val isEmpty: Boolean
        get() = true  // Can provide getter and setter
    fun store(obj: Customer){
        // implement code to store    /* body exist here */
    }
    fun getById(id: Int): Customer
}

class SQLCustomerRepo: InterfacesInKotlin{
    override fun getById(id: Int): Customer {
        return Customer()    }
    override fun store(obj: Customer) {
    }
    override val isEmpty: Boolean
        get() =  false
}

/* Diamond problem in Java
*
*
*
* */

interface Interface1 {
    fun funA() {
        println("Fun A from Interface 1")
    }
}

interface Interface2 {
    fun funA() {
        println("Fun A from Interface 2")
    }
}

class Class1And2: Interface1,Interface2 {
    override fun funA() {
        //println("It is our own implementation")
        super<Interface2>.funA()
        super<Interface1>.funA()
    }
}

fun main(){
    val c = Class1And2()
    c.funA()
}