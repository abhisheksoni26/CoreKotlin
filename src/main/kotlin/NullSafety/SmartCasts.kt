package NullSafety

fun main() {

    var str = "Hey! I am an Android Developer"

    if (str is String){
        println("YES")
    }
    else{
        println("No")
    }


    var a = "Abhishek"

    if (a !is String){
        println("Not a String")
    }
    else{
        println("Length of String is : ${a.length}")
    }
}