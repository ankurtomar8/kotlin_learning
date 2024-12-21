import javax.management.ValueExp

fun main(){

    var myString ="Not Empty "

  val result =   if (myString != ""){
        println("Not Empty")
    }
    else {
        println("Is Empty")
    }
    println(result)

    val result2 =   if (myString != ""){
   "Not Empty"   /// Insane about kotlin
        20
    }
    else {
       "Is Empty" /// Insane about kotlin   result printed
    }
    println(result2)



    val result3 =   if (myString != ""){
        "A new String not  Empty"   /// Insane about kotlin
    }else {
        "Another String in else block"
    }

    when(result3){
        "Value" -> println("It's a value ")
        is String -> println("Excellent")
    }
    println(result3)

    // When is used an expression

    val resul = "Value"
    val whenValue = when (resul){
        "Value" -> {
            println("Is a Value ")
            println("Second Value statement")
            "Returning from First when case"                /*  Second Value statement Returning from First when case */
        }
        is String -> {
         println("Excellent")
        "Remove That"}
        else -> {
            println("It Came to this?")
            "Remove this as well"
        }
    }
    println(whenValue)
}