package tidbits

import org.w3c.dom.css.Counter

class Tuples {

}

fun capitalAndPopulation(country: String): Pair<String,Long>{
    return Pair("AHD",100000)
}

fun countryInformation(country: String): Triple<String,String,Long>{
    return Triple("INDB", "India",12000)
}

fun main(){
    val results = capitalAndPopulation("AHD")

    println(results.first)  // Access value of pair through component first
    println(results.second) // Access value of pair through component second

    val TripleResult = countryInformation("INDB")
    println("Value of Triplets"+TripleResult.first)
    println("Value of Triplets"+TripleResult.second)
    println("Value of Triplets"+TripleResult.third)

    val (capital,population) = capitalAndPopulation("AHD")
    println("Desconstruct "+capital)
    println("Desconstruct "+population)
}