
fun main(){

    var n = readLine()!!.toInt()

    var start = 1
    var result = 1
    while(result < n){
       result = start * 4;
       if(result > n){break}
       print("$result ")
       start++
    }


}