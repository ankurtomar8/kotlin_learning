fun main(){
    var A = readLine()!!.toInt()
    var B = readLine()!!.toInt()
    var C = readLine()!!.toInt()

    if(A > B && A > C){
        println(A)
    }else if(B > A && B > C ){
        println(B)
    }else{
        println(C)
    }

    println(maxOf(A,B,C)) // inbuilt function

}