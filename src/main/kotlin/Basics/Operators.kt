package Basics

fun main() {

    var a = 10
    var b = 5

    var max : Int

    if (a>b){
        println("a is greater than b")
         max = a
    }
    else{
        println("b is greater than a")
        max = b
    }

    println("Max is $max")

    println()

//Assignment Operators ->

    a+= b
    println("a+=b : $a" )

    a-= b
    println("a-=b : $a" )

    a*= b
    println("a*=b : $a" )

    a/= b
    println("a/=b : $a" )

    a %= b
    println("a%=b : $a" )



}