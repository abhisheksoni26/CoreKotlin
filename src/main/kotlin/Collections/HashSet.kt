package Collections

fun main() {

    var hashsets = hashSetOf<String>("Abhi", "Yash", "Shubham", "Deep")

    hashsets.add("Viranch")
    hashsets.add("Abhishek")

    for (i in hashsets){
        println(i)
    }
    println(hashsets.size)

    var hashset2 : HashSet<String> = hashSetOf("Vijay", "Abhishek", "Vijay")

    println(hashset2)

}