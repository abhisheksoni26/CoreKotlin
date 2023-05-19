package ClassesAndObjects

open class Hello(){

//    open var abc = 1
////    protected open var b = 2
////    private var c = 3
////    internal var d = 10

    internal val a = 10


}

class Derived: Hello(){
    fun getValue() : Int{
        return a
    }

}

fun main(){

    var a=Derived()
    println(a.getValue())
}