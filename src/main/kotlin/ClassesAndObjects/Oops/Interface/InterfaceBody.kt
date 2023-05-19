package ClassesAndObjects.Oops.Interface

fun main() {

    val obj = InterfaceBody()
    obj.doSomething()
    println(obj.absMethod())
    println(obj.dept)
    println(obj.salary)

}

class InterfaceBody: Interface, Interface2{
    override var id: Int = 100

    override fun absMethod(): String {
        return ("Name is Abhishek, ID is $id")
    }

    override fun doSomething() {
        super<Interface2>.doSomething()
    }

    override var dept: String = "Android Department"

    override var salary: Int = 30000



}