fun main(){
     var  n = readLine()!!.toInt()

   var  start = 1
     while(start <= n){
        if( start % 2 != 0){
         print("${start} ")
        }
          start++
     }
}