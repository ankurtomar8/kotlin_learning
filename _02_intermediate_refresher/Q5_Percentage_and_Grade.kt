fun main(){
    var A =  readLine()?.toIntOrNull() ?: 0
    var B =  readLine()?.toIntOrNull() ?: 0
    var C =  readLine()?.toIntOrNull() ?: 0
    var D =  readLine()?.toIntOrNull() ?: 0
    var E =  readLine()?.toIntOrNull() ?: 0
    var F =  readLine()?.toIntOrNull() ?: 0


/*   Bad approach in kotlin 
    if(A >= 90){
        println("${A}\nA")
    }else if(B >= 80 && B < 90 ){
        println("${B}\nB")
    } else if(C >= 70 && C < 80 ){
        println("${C}\nC")
    }else if(D >= 60 && D < 70 ){
        println("${D}\nD")
    } else if(E >= 40 && E < 60 ){
        println("${E}\nE")
    }       
    else{
        println("${F}\nF")
    } */


when {
    A >= 90 ->   println("${A}\nA")
    B in 80..89 ->  println("${B}\nB")
    C in 70..79 ->  println("${C}\nC")
    D in 60..69 ->  println("${D}\nD")
    E in 40..59 ->  println("${E}\nE")
    else ->   println("${F}\nF")
}


}