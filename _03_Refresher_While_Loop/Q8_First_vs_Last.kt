
fun main(){

    var T = readln()!!.toInt()

    while(T > 0){
        var n = readln()!!.toInt()

        var lastDigit = n % 10
        var firstDigit = 0
        while(n > 0){
            firstDigit = n % 10
            n = n / 10
        }
        print("$firstDigit $lastDigit")
        T--
        println("")
    }



}