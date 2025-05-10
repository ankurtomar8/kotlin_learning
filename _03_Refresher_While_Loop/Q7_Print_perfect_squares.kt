
fun main(){

   var n = readLine()!!.toInt()

    var start = 1
    var result = 1
    while(result < n){
       result = start * start;
       if(result > n){break}
       print("$result ")
       start++
    }


}