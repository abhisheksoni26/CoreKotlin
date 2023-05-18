package Functions.InLineFunctions

fun main() {

    TakeIt({
        println("myFun ka Print")
    return}, { println("Doosra Fun")})

}


inline fun TakeIt (myFun: () -> Unit, nextFun: () -> Unit){
    myFun()
    nextFun()
    println("Ho Gaya")
}