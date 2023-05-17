package Functions

fun main() {
    //User Defined Fns->
    sum()

    //Kotlin parameterize Fns ->
    println(Multiply(2, 10))

    println("Rest of the code...")
}

fun sum(){
    var a = 20
    var b = 30

    println("Ans is : " + (a+b))
}

fun Multiply(num1 : Int, num2 : Int) : Int{
    var res = num1*num2
    return res
}