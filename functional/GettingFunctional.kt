package functional


fun transaction(db: Database,code: () -> Unit){
   try {
       code()
   }finally {
       db.commit()
   }
}

class Database {
   fun commit() {

   }
}

fun operation(x:Int, y: Int, op: (Int,Int) -> Int):Int {
   return op(x,y)
}

fun sum (x: Int , y: Int) = x+y

fun unaryOperation(x:Int, op: (Int) -> Int){

}

fun main(){
   println( operation(1,2, ::sum) ) // Passing sum function to operation function rather then storing values
     //
   println(""+  operation(4,2,{x,y -> x+y})) // Lambda expression

   println(unaryOperation(2,{ x -> x * x }))

   println(unaryOperation(3,{ it * it }))

   println(unaryOperation(3) { it * it })


   val db = Database()

   transaction(db) {  /// Creating own keyword DSL transaction more meaning
      // interact with database
   }

}

class GettingFunctional {
}