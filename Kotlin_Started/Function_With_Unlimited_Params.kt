

fun printStrings(vararg strings:String){
    reallyPrintingStrings(*strings) /// Spread operator
}

/*
* Breaking functions into another function from above
* */
private fun reallyPrintingStrings(vararg strings: String) {
    for (string in strings) {
        println(string)
    }
}

fun main(){
    printStrings("1")
    printStrings("1","2")
    printStrings("1","2" ,"3")
    printStrings("1","2" ,"3","4")

}