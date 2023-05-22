package Collections

fun main() {

    var setof1 = setOf<String>("Abhi", "Shubham", "") // It takes null values

    for (i in setof1){
        println(i)
    }

    println()
    println()
    println()

    var setof2 = setOf<Any>("Yash", "Abhi", "Yash" , 1,2,3,2,1) // No Duplicate Attributes

    for (i in setof2){
        println(i)
    }

}