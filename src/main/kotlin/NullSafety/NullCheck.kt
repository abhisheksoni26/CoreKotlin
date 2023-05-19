package NullSafety

fun main() {

    var str: String? = "Hello"

    println(str?.length)

    var string: String? = "Abhishek"

//    string = null  -> This will change the output

    var len = if (string != null) string.length else -1

    println("String is $string")
    println("Length is $len")

}