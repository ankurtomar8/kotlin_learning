package functional


fun operation(x:Int, y: Int, op: (Int,Int) -> Int):Int {
   return op(x,y)
}

fun sum (x: Int , y: Int) = x+y

fun main(){
   println( operation(1,2, ::sum) ) // Passing sum function to operation function rather then storing values
     //
}

class GettingFunctional {
}