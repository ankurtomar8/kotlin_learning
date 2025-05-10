
fun throwingExceptions(): Nothing{
    throw  Exception("This function throws an")
}

fun returnAFour(): Int {
    return 4  // fun returning 4
}

fun hello(): Unit {
    println("Hello")
}

fun takingString(name:String){
    println(name)  // function calling params
}

/*

fun sum(x : Int, y: Int):Int{
    return x + y
}
*/

fun sum(x : Int, y: Int) = x + y // This also works  Single Expression



fun main(){
    hello()
    val  value = returnAFour()
    println(value)
    takingString("Some Random Sh**")
  val z = sum(10,20)
    println(z)


}

