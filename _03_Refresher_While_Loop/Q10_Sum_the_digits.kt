fun main(){
       var T = readln()!!.toInt()

    while(T > 0){
        var n = readln()!!.toInt()

        var firstDigit = 0
        var sum = 0
        while(n > 0){
            firstDigit = n % 10
            n = n / 10
            sum += firstDigit
        }
        print("$sum")
        T--
        println("")
    }

}