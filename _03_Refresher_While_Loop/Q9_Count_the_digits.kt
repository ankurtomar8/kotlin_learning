fun main(){

       var T = readln()!!.toInt()

    while(T > 0){
        var n = readln()!!.toInt()
     
        var DigitsCounter = if (n == 0) 1 else 0 
      
        while(n > 0){
            n = n / 10
            DigitsCounter++
        }
        println("$DigitsCounter")
        T--
       // println("")
}

}