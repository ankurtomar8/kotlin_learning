//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
   var StreetNumber = 20
   var streetName = "High Street"

    println(StreetNumber)
    println(streetName)

    val zip = "E11 P1" // Immutable
    streetName = "Pudding Lane"


  //  zip = "S1W 2PS"  Error Kotlin: 'val' cannot be reassigned

    val myLong = 10L
    val myFloat = 100F
    val myHex = 0x0E //14
    val myBinary = 0xb01 //
    println(myLong)
    println(myFloat)
    println(myHex)
    println(myBinary)

    val myInt = 500
    val myLongAgain: Long = myInt.toLong()

    println(myInt)
    println(myLongAgain)

    // Strings
    val myChar ="A   "
    val myString = "My String "

    print(myChar)
    print(myString)

    val escapeCharacters = "A new line \n"
    val rawStrings = "Hello"+ " This is second line" + "A third line \n"
    val multipleLines = """ This is String 
       
        And this is another Line 
         |
    """.trimMargin()
    print(escapeCharacters)
    print(rawStrings)
    println(multipleLines)


    val years = 10
    val message = "A Decade is $years years"
    val name = "Ankur"
    val length = "Length of message ${name.length}"
    println(message)



}