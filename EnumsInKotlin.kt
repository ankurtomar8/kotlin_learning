
enum class Priority(val value:Int) {
    MINOR(-1), //0
    NORMAL(0), //1
    MAJOR(1), //2
    CRITICAL(10) //3
}


fun main(){

    val priority = Priority.NORMAL
    println(priority.toString())
    println(priority.value)
    println(priority.ordinal)
    println(Priority.CRITICAL.name)

    for (priorityInList in Priority.values() )
            println(priorityInList)

    val p = Priority.valueOf("MAJOR")
    println(p.ordinal)
}