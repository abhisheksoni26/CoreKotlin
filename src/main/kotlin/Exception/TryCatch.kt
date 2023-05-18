package Exception

fun main() {

    try {
        val a = 20/0
    }catch (e:ArithmeticException){
        println(e)
    }


    var num = number("10.22")

    println(num)

    println("Below Code...")

}

fun number(str: String): Int{

   return try {
       Integer.parseInt(str)
    }catch (e : NumberFormatException){
        0
    }

}