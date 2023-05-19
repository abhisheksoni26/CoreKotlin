package ClassesAndObjects

fun main() {

    var  obj = Second("Abhishek", "PAss", 201)

}

open class Main{

    constructor(name: String, pass: String){

        println("Runs first")
        println("Name is $name")
        println("Pass is $pass")

    }

}

class Second : Main {

    constructor(name: String, pass: String, id:Int):super("Yo Yo : "  + name,pass){

        println("Runs Second")
        println("Name is $name")
        println("Pass is $pass")
        println("ID is $id")

    }

}