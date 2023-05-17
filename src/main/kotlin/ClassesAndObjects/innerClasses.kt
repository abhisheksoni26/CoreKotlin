package ClassesAndObjects

class outerHai{
    private var name = "Abhishek Soni"
    inner class innerClass{
         var description = "I'm an Android Developer"
         var id = 1001

        fun print(){
            println(name)
            println(description)
            println("Id is: $id")
        }
    }
}
fun main() {
    var obj = outerHai().innerClass()

    obj.print()


}