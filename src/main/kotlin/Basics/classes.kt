package Basics
    class Rectangle(var height: Int, var length : Int){

        var peri = (height+length)*2

    }

    fun main(){

        val peri = Rectangle(10, 20)
        println(peri.peri)

    }
