
fun sum(x :Int, y : Int, z : Int = 0) =  x + y + z

fun printDetails(name:String,email:String = "",phone:String = "NA"){
    println("name: $name - email: $email - phone: $phone")
}

fun main(){

    val s = sum(1,2,3)
    println(s)
   val s2 =  sum(1,2)
    println(s2)

    printDetails("Ankur",phone="555 12 3") // specify value to params by sending it with Call
    printDetails("Ankur",phone="555 12 3", email = "someranmdomemail") // specify value to params by sending it with Call
}                                                // Calls the phone number which is explicit second params
                                                 //Params can be called in any order                

