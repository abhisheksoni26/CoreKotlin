package ClassesAndObjects

fun main() {

    MyClass.helloWorld()
    MyClass.print()

}

class MyClass{
    companion object{
        fun print(){
            println("Hello, I am your Companion Object")
        }
    }
}

fun MyClass.Companion.helloWorld(){
    println("Hello! World")
}