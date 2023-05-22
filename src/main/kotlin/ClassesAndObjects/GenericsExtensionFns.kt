package ClassesAndObjects

import java.lang.Integer.parseInt

fun main() {

    var arr = arrayListOf<Int>(1,2,3,4,5,6,7,8,9,10,11,12)
    arr.printValue()
    println()
    println()
    println()
    arr.sepratingEvenOdd()

    println()
    println()

    var stringArr = arrayListOf<String>("1", "2", "3", "4", "5", "6", "7", "8")

    stringArr.sepratingEvenOdd()

    println()

    var arrString = arrayListOf<String>("Abhishek", "Shubham")
    arrString.printValue()

}

fun <T>ArrayList<T>.printValue(){

    for (i in this){
        print(" " + i )
    }

}

inline fun <reified T>ArrayList<T>.sepratingEvenOdd(): ArrayList<T>{

    if (T::class.simpleName.equals("Int")){
        for (i in this){
            if (i as Int %2==0){
                println(i)
            }
            else{
                continue
            }
        }
        return this
    }
    else{
        for (i in this){
            if (parseInt(i.toString())%2 == 0){
                println(i)
            }
            else{
                continue
            }
        }
        return this
    }

}
