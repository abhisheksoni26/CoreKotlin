package Collections

fun main() {

    var hashMap = hashMapOf<Int, String>(1 to "Abhi", 2 to "Hello", 3 to "Shubham")

    hashMap.put(4,"Deep")

    for (i in hashMap){
        print(" " + i )
    }

    println()
    println()

    println(hashMap.values)

    hashMap.replace(3, "Shubham", "Viranch")

    println(hashMap.values)

}