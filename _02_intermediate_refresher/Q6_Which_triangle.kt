fun main(){
  /*   var A =  readLine()?.toIntOrNull() ?: 0
    var B =  readLine()?.toIntOrNull() ?: 0
    var C =  readLine()?.toIntOrNull() ?: 0 */
    val (A, B, C) = readln().split(" ").map { it.toInt() }

    // println("A = $A, B = $B, C = $C") // Debugging output


/*     if(A == B && B == C && C == A){
        println("equilateral")
    }else  if(A != B && B != C && C != A){
         println("scalene")
    }
    else{
        println("isosceles")
    } */

    println(
        when {
            A == B && B == C -> "equilateral"
            A == B || B == C || C == A -> "isosceles" 
            else -> "scalene"
        }

    )
}