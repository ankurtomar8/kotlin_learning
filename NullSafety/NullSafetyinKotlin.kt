package NullSafety


//class Service {
//    fun evaluate(){
//    }
//}
//
//class ServiceProvider {
//    fun createService(): Service? {
//    }
//}

fun main(){
    val message: String = "A message"
  //  val message2: String = null  Type cannot be null
    val nullMessage: String? = null
    var nullMessage2: String? = null
    nullMessage2 = "This Null Message"
    val inferredNull  = null  // without explicit data type
    println(message.length)
 //   println(nullMessage.length) // Error, Only safe (?.) or non-null asserted (!!.) calls are allowed on a nullable receiver of type String?
    println("Handled Null through ?"+nullMessage?.length)
  //  println("Handled Null through !!"+nullMessage!!.length) // Its OK compiler to know Null pointer will come
 //   println(inferredNull.length) Error
    println(nullMessage2.length)  // No Error Null Message is passed

//    val sp = createServiceProvider()
//    sp?.createService()?.evaluate()

}
/*

private fun createServiceProvider():ServiceProvider? = ServiceProvider() {
}*/
