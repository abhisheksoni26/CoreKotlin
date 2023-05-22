package Collections

fun main() {

    var stringList = listOf<String>("Ajay", "Vijay", "Abhishek", "Shubham", "Prakash","Vijay", "Ramesh")
    var list = listOf<String>("Ajay", "Abhishek", "Shubham")

    for (i in stringList){
        print(" " + i)
    }

    println()

    for (i in stringList.indices){
        print(" " + stringList[i])
    }

    println()
    println()

    println()

    println(stringList.get(0))
    println(stringList.indexOf("Vijay"))
    println(stringList.lastIndexOf("Vijay"))
    println(stringList.subList(2,5))
    println(stringList.containsAll(list))
    println(stringList.contains("Abhishek"))
    println(stringList.isEmpty())
    println(stringList.drop(1))
    println(stringList.dropLast(3))
    println(stringList.reversed())
    println(stringList.shuffled())




}