package ControlFlow

fun main() {

    var arr = arrayOf(1,2,3,4,5)

    for (items in arr){
        print("$items ")
    }

    println()
    println()

    for (i in arr.indices){
        print("Number[$i] -> " + arr[i] + "  ")
    }

    println()
    println()


    for (i in 1..5){
        print(" $i")
    }

    println()

    for (i in 5 downTo 1){
        print(" $i")
    }

    println()

    for (i in 5 downTo 0 step 3){
        print(" $i")
    }

}