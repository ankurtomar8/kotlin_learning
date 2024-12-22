
data class CustomerKotlin(var id : Int, var name:String, var email:String)
// Data return object in console

/*
*
*   data is saved from toString and hasCode
*   Reduce the boiler plate code
*
* */

fun main(){
    val customerKotlin1 = CustomerKotlin(1,"Ankur", "abe@gmail.com")
    val customerKotlin2 = CustomerKotlin(1,"Ankur", "abe@gmail.com")

    println(customerKotlin1)
    println(customerKotlin2)

    if(customerKotlin1 == customerKotlin2){
        println("They are equal ") // excuted when data key are added in class
    }

    val customer3 = customerKotlin1

    println(customer3.id)

    val customer4 = customerKotlin2.copy( email = "bbc@gmail.com")
    println("Customer 4 is printed"+customer4)

}