package Functions

var count = 0
fun repeat(){

    count++

    if(count<=5){
        println("Hello!! $count")
        repeat()
    }
}
fun Factorial(num: Int): Int{

    return if (num==1){
        num
    }else{
        num* Factorial(num-1)
    }
}

fun main() {
//    repeat()

    println(Factorial(3))
}
