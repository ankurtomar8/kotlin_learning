package CustomerClass

import java.util.Calendar

class CustomerClass {
    var id : Int = 10
    var name: String = ""
    var surname: String = ""

}

class CustomerNew(var id:Int , var name: String ){
    init {
        name=name.toUpperCase()
    }
} /// Declaring customer class as per params
// Self constructor


class CustomerNew4(var id:Int , var name: String ){
    init {
        name=name.toUpperCase()
    }
    constructor(
        email:String
    ): this(0,"")
}

class GetterAndSetters(val id: Int, var name: String, val yearOfBirth: Int){
    val age:Int
        get() = Calendar.getInstance().get(Calendar.YEAR) - yearOfBirth // This single statement return get

    var IdentityNumber:String = ""
        set(joe) {
            if(!joe.startsWith(("SN"))){
                throw IllegalArgumentException("Social Security should start with SN")
                /// Exception in thread "main" java.lang.IllegalArgumentException: Social Security should start with SN
            }
            field = joe
        }
}


fun main(){
    val customer = CustomerClass()
    customer.id = 10
    customer.name = "Ankur"
    customer.surname = "Tomar"

    val customerNew = CustomerNew(10,"Ankur")
    println(customerNew)
    println(customerNew.name) // ANKUR to uppercase

  /*  val customerNew2 = CustomerNew(10)
    println(customerNew2)*/

    val customerNew4 = CustomerNew4(10,"Ankur")

    val age = GetterAndSetters(10,"Ankur",1998)
    println(age.name)    /*     Ankur 26 */
    println(age.age)
   // age.IdentityNumber = "1234"
    age.IdentityNumber = "SN1234"
    println(age.IdentityNumber)  // Output SN1234

}