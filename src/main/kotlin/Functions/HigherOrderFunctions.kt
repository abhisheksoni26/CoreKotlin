package Functions

fun hello(name: String, age: Int, fn: (String, Int) -> String){
    val result = fn(name, age)
    println(result)
}
fun main() {
//
//    val fn: (String, Int) -> String = {name,age -> "$name, and age is $age"}

//    hello("Abhishek", 21, fn)

//    hello("Abhishek", 21) {
//            name, age -> "$name, and age is $age"
//}

    var fn: (String, Int) -> String = {name,age->
        "Name is $name, and Age is $age"
    }

    hello("Abhishek", 21, fn)

}