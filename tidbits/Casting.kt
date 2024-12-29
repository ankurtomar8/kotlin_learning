package tidbits

import java.util.Objects

open class Person{

}

class Employee: Person(){
    fun vacationDays(days: Int){
       if(days < 60){
           println("You need more vacation")
       }
    }
}

fun hasVacations(obj: Person){
    if(obj is Employee){
        obj.vacationDays(20) // Smart Cast  ,   Smart cast to tidbits. Employee
    }/*else{
        obj.   Else part do not have access to vacation days
    }*/
}

class Contractor: Person(){

}

var input: Any = 10

fun main(){
    val str = input as? String //

    println(str?.length) // Smart Cast with Elvis Operator

}