package ClassesAndObjects

fun main() {

    var data = Data("Abhishek", "HelloPass")

}

class  Data{

    constructor(name: String, pass: String): this(name, 10, pass){

        println("Name = $name")
        println("Password = $pass")

    }

    constructor(name: String, id: Int, pass: String) {

        println("Name 2 = $name")
        println("ID 2 = $id")
        println("Pass 2 = $pass")

    }
}