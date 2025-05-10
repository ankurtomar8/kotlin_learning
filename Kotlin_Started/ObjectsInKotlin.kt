
object Global {
    val PI =3.14
    val area = 22.1
}

fun main(){

    val localObject = object {
        val PI = 3.14159
    }

    println(localObject.PI) // Lazy way


    println(Global.PI)
    println(Global.area)
}