package Collections

fun main() {

    var mutableMap = mutableMapOf<Int, String>(1 to "Abhi", 2 to "Shubham", 3 to "Viranch", 4 to "VasyERP")

    mutableMap.put(5, "Deep")

    for (itr in mutableMap.iterator()){
        println(itr.value)
    }

    println()
    println()
    println()

    var mutableMap1 = mutableMapOf<Any, Any>("a" to "Abhishek", "b" to "Yash", "c" to "Shubham" )

    var itr = mutableMap1.iterator()

    while (itr.hasNext()){
        println(itr.next())
    }
}