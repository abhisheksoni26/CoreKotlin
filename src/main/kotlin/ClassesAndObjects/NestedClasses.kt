package ClassesAndObjects

class outerClass{
     var name = "Abhishek Soni"
    class nestedClass{

        var description = "I'm an Android Developer"

        private var id = 101
        fun print(){

            println("Id is $id")
        }

    }
}

fun main(){
    println(outerClass().name)

    println(outerClass.nestedClass().description)

    var obj = outerClass.nestedClass()


    obj.print()



}