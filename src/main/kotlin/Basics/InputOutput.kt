package Basics

import java.util.Scanner

fun main() {

//    Way 1 ->

//    println("Enter You Name")
//    var name = readLine()
//
//    println("Enter Your Age")
//    var age : Int = Integer.valueOf(readLine())
//    println(age)

    //Way 2 ->

    var s = Scanner(System.`in`)

    var age1: Int = s.nextInt()
    var names: String = s.next()

    println("Name : $names and Age is : $age1")






}