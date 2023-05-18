package Arrays

fun main() {

    var arr = arrayOf(1,2,3,4,5)

//     var arr: Array<Int> = arrayOf<Int>(1,2,3,4,5) We can do this also



    for (a in arr){
        print(" "+ a)
    }

    println()
    //We can set 2 data types in single array ->

    var arr1 = arrayOf(1,2,3,"Abhishek", "Shubham", "VasyERP")

    for (i in arr1){
        print(" "+ i)
    }

    //We can state the type of array ->

    println()

    var arr2: IntArray = intArrayOf(1,2,3,4,5,6)
    for (i in arr2){
        print(" "+ i)
    }

}