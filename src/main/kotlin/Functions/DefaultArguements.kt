package Functions

fun main() {
//    run()
//    run(3, "Shubham")
    run( name = "Yash", n = 10) //Named Arguement
/* So if I don't provide any arguement in this fn, then it will take the default arguement as shown in fn */
}

fun run(n: Int = 5, name: String = "Abhishek"){

    println("Number is $n and Name is $name")
}