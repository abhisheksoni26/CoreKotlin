package ControlFlow.Condition

fun main() {

    var a = 20
    var b = 30
    var c = 10


    //Way 1 ->
    var result = if (a>b){

        "$a is greater than $b"

    }else{
        "$b is greater than $a"
    }


    //Way 2 ->
    var result1 = if (a>b) "$a is greater than $b" else "$b is greater than $a"

    println(result)
//    println(result1)



    //If-else Ladder Expression ->

    var ans = if (a>0){
        "$a is Positive"
    }
    else if (a<0){
        "$a is Negative"
    }
    else{
        "$a is Zero"
    }

    println(ans)



    //Nested If-else ->

    var max = if (a>b){
        if (a>c){
            a
        }else{
            c
        }
    }
    else{
        b
    }

    println(max)


}