 fun main () {
     for (a: Int in 1..10){ // Numbers 1 to 1
         print(a) // Output 12345678910
     }

     val numbers = 1..10

     println("")

     for (a in numbers){
         print(a)  // Output 12345678910
     }
     println(" ")

     for  (a in 10 downTo 1) {
         print(a) // Down to  Output 10987654321
     }

     println(" ")
     for (a in 100..1){
         print(a)
     }
     println(" ")

     for (b in 100 downTo 1 step 5){  // Skips the loop by Five
         print(" "+b)                       // Output  100 95 90 85 80 75 70 65 60 55 50 45 40 35 30 25 20 15 10 5
     }

     println(" ")
     val capitals = listOf("AHD","INDB","GUNA","GNC","GWL")

        for(capital in capitals){
            print(" "+capital)   // Prints list of items array  AHD INDB GUNA GNC GWL
        }

     println(" ")
     var i = 50
     while (i > 0){
         i--
         print(" "+i) // While loop output 49 48 47 46 45 44 43 42 41 40 39 38 37 36 35 34 33 32 31 30 29 28 27 26 25 24 23 22 21 20 19 18 17 16 15 14 13 12 11 10 9 8 7 6 5 4 3 2 1 0
     }

     println(" ")
     do {
         var x= 20
         x--
         println(" "+x) // output 19
     }while (x > 25)


     // Annotate loop to use loop functionality
   loop@  for (i in 1..100){
         for (j in 1..100){
             if (j%i ==0){
                 println(i) // output 1
                 break@loop
                // continue@loop
             }
         }
     }

 }


