package Basics

fun main() {

    var a = 10

    var s1 = "a is $a"

    a = 20

    println("${s1.replace("is", "was")}, but now a is $a")



}