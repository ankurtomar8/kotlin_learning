fun main(){
    val A = readLine()!!.toInt()
    val B = readLine()!!.toInt()

    println(
        when{ 
        A > B -> "${B}"
        B > A -> "${A}"
        else -> "Equal"
        }

    )


}