package Functions.InLineFunctions

fun main() {

    calculateTime {
        num(10)
    }

}

inline fun calculateTime(fn:()-> Unit){

    val start: Long = System.currentTimeMillis()
    fn()
    val end: Long = System.currentTimeMillis()

    println()
    println()

    println("Time Taken: ${end-start}ms")
}

fun num(a: Int){
    for (i in 1..a){
        println("Hello!!")
    }
}