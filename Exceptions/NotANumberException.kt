package Exceptions

class NotANumberException(message: String): Throwable(message) {
}

fun checkIsNumber(obj: Any){
    when (obj){
        !is Int, Long, Float, Double -> throw NotANumberException("It was not number! Handled the exception")

        // output /*
    // Exception in thread "main" Exceptions.NotANumberException
        //	at Exceptions.NotANumberExceptionKt.checkIsNumber(NotANumberException.kt:8)
        //	at Exceptions.NotANumberExceptionKt.main(NotANumberException.kt:13)
        //	at Exceptions.NotANumberExceptionKt.main(NotANumberException.kt)
    // */
    }
}

fun main(){
    try {
        checkIsNumber("A")
    }
    catch (e:IllegalStateException){
        println("Do nothing!")
    }
    catch (e:NotANumberException){
        println("${e.message}")
    }



}