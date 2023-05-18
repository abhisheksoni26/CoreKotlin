package Functions.InLineFunctions

fun main() {

    TakeIt1({
        println("myFun ka Print")
        return@TakeIt1
    }, { println("Doosra Fun")})

}

//To prevent return from lambda expression and inline function itself, we can mark the lambda expression as crossinline.

inline fun TakeIt1 (crossinline myFun: () -> Unit, nextFun: () -> Unit){
    myFun()
    nextFun()
    println("Ho Gaya")
}