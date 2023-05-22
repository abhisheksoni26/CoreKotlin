package ScopeFns

class Data{
    lateinit var name : String
    lateinit var Department : String
    lateinit var Bio : String
}

fun main() {

    val obj = Data().apply {

        name = "Abhishek Soni"
        Department = "Android"
        this.Bio = "Hello!!"


    }


    with(obj){
        println(name)
        println(Department)
    }




}