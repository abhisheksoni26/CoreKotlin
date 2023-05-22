package ClassesAndObjects

fun main() {

    var ageInt: Person<Int> = Person(10)
    var ageString: Person<String> = Person("30")


}

class Person<T>(age: T){
    var age: T = age

    init {
        this.age = age
        println(age)
    }
}