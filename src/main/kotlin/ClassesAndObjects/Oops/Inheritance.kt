package ClassesAndObjects.Oops

open class Employee(name: String, salary: Int){
    init {
        println(name)
        println(salary)
    }
}

class Programmer(name: String, dept: String, salary: Int): Employee(name, salary){

    init {
        println("Name = $name, dept = $dept, Salary = $salary")
    }
    fun doProgram(){
        println("Programming is my passion")
    }

}

class Salesman(name: String, dept: String, salary: Int): Employee(name, salary){

    init {
        println("Name = $name, dept = $dept, Salary = $salary")
    }
    fun fieldWork(){
        println("I Love Field Work")
    }

}

fun main() {

    val obj = Programmer("Abhishek", "Android Developer", 30000)
    obj.doProgram()
    val obj1 = Salesman("Shubham", "SalesMan", 20000)
    obj1.fieldWork()


}
