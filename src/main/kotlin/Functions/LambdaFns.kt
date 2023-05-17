package Functions

import Functions.abhi as abhi

class abhi{
    fun constructor(a: Int, name: String = "ABhi") {
        println("$a and $name")
        println(a.toString() + name)
    }
}

fun main() {

    var acc = abhi()

    acc.constructor(20, "Viranch")

//    println(acc.name)

//    val myLambda: (a: Int, b: Int) -> Unit = {i,j->
//        println(i+j)
//    }
//    myLambda(20, 30)

}