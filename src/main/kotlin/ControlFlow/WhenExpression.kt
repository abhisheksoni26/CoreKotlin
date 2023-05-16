package ControlFlow

fun main() {

    var num = 3

    when(num){
        1-> println("One")
        2-> println("Two")
        3-> println("Three")
        4-> println("Four")
        else -> println("Invalid Number")
    }

    println()

    //When Expression with multiple statements ->

    when(num){
        1 ->{
            println("Number is One")
            println("num = $num")
        }

        2 ->{
            println("Number is Two")
            println("num = $num")
        }

        3 ->{
            println("Number is Three")
            println("num = $num")
        }

        4 ->{
            println("Number is Four")
            println("num = $num")
        }
    }


    println()


    //When Expression with Multiple Branches ->

//    when(num) {
//
//        1,2 -> println("Okay")
//
//        3,4 -> println("Awesome")
//
//
//    }
    /*                     O R                             */

    when(num){
        in 1..3 -> println("Okay")

        in 4..6 -> println("Awesome")
    }

}