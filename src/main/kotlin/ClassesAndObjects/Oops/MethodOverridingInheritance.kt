package ClassesAndObjects.Oops

fun main() {

    var tiger = Tiger()
    var dog = Dog()

    tiger.run()
    dog.run()

}

open class Animal{
    open fun run(){
        println("Animal Hai...")
    }
}

class Tiger: Animal(){

    override fun run() {
//        super.run()
        println("Tiger is running...")
    }

}

interface Pig{
    fun run(){
        println("Pig is running...")
    }
}

class Dog: Animal(),Pig{

    override fun run() {
        super<Animal>.run()
        super<Pig>.run()
        println("Dog is running...")
    }
}