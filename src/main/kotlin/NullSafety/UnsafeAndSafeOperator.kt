package NullSafety

fun main() {
    var a: Any? = "String"
    var str: Int? = a as? Int

    println(str) // Here we are safe casting data types.
}