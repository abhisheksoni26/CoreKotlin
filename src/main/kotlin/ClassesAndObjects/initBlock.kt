package ClassesAndObjects

class primaryInit  {

    var name_ : String? = null
    var id_ : Int? = null
    constructor(){
        println("Name is 0 $name_")
        println("Id is 0 $id_")
    }

init {

    println("Name is 2 $name_")
    println("Id is $id_")
}
    fun tez(){
        println("Name is 1 $name_")
        println("Id is $id_")
    }
}
fun main() {

    var data = primaryInit()
    data.tez()

}