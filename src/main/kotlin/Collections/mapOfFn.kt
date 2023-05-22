package Collections

fun main() {

    var mapof = mapOf<Int, String>(1 to "Abhishek", 2 to "Shubham", 3 to "Deep")

    for (i in mapof.keys){
        println("Key = $i and Value = ${mapof[i]}")
    }

    println()
    println()

    println(mapof.values)
    println(mapof.keys)


    println()
    println()

    for (map in mapof.minus(3)){
        println(mapof[map.key])
    }

    println()
    println()


    for (itr in mapof.iterator()){
        println(itr)
    }

   println( mapof.getOrDefault(3,"Viranch"))


}