package ControlFlow.KotlinReturnAndJump

fun main() {

    for (i in 1..5){
        for (j in 1..3){
            println("i = $i and j = $j")
            if (i==2){
                break
            } // Because of this break statement only j loop will break at that time when i == 2 but then i loop again starts for value 3 and then j start and loop continues...
            //To break this whole condition we use labelled break statement with @ sign which is extending by a label (Example below :)
        }
    }

    println()
    println()
    println()


    Loop@ for (i in 1..3){
        for (j in 1..3){
            println("i = $i and j = $j")
            if (i==2){
                break@Loop // This will terminates the outer loop where label is placed
            }
        }
    }

}