package functional


fun outsideFunctions(){   /// The number scope is defined in function

    for (number in 1..30) {
     //   val number = 10

        unaryOperation(20, { x ->
            println(number)
            x * number

        })
    }
}


fun main(){
    outsideFunctions()
}