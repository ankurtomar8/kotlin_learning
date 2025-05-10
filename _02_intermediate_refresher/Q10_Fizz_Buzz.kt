fun main(){
    var n = readLine()!!.toInt()

println(
    when{
        n % 3 == 0 && n % 5 == 0 -> "FizzBuzz" 
        n % 3 == 0 -> "Fizz"
        n % 5 == 0 -> "Buzz"
        else -> "Invalid input"
    }
)
}