package ControlFlow.KotlinReturnAndJump

fun main() {

    for (i in 1..3){
        println("i = $i")

        if (i==2){
            continue //This will not execute further statements for i==2, and directly jumps to the i==3 loop..
        }
        println("Helloo!!!")
    }


    println()
    println()

    for (i in 1..3){
        for (j in 1..3){
            println("i = $i and j = $j")
            if (i==2){
                continue //This will runs all j statements at i==2 but not runs Hello! statemnts
            }
            println("Hello!")
        }

    }

    println()
    println()

    Label@ for (i in 1..3){
        for (j in 1..3){
            println("i = $i and j = $j")
            if (i==2){
                continue@Label // when we get i == 2 it will jumps to i == 3 after looping once for i==2
            }
            println("Hello!")
        }

    }

}