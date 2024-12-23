package InheritanceInKotlin

import throwingExceptions

abstract class StoredEntity{
    val isActive = true
    abstract fun store()
    fun status():String{
        return isActive.toString()
    }
}


class Employee: StoredEntity(){
    override fun store() {
        throw UnsupportedOperationException("not implemented")
    }
}


fun main(){
   // val abs = StoredEntity()   // Error can't create entity of abstract class
    val abs = Employee() // [Okm]

    abs.isActive
    abs.status() // No error
}