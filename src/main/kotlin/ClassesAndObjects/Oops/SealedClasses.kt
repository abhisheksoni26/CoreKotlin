package ClassesAndObjects.Oops

sealed class Shape(){
    class Rectangle(var length: Int, var breadth : Int): Shape()
    class Circle(var radius: Float): Shape()
    class Square (var side: Int): Shape()

}

fun eval(e: Shape){

    when(e){

        is Shape.Circle -> println("Circle area is ${3.14*e.radius*e.radius}")

        is Shape.Rectangle -> println("Rectangle area is ${e.length*e.breadth}")

        is Shape.Square -> println("Square area is ${e.side*e.side}")
    }

}

fun main() {

    var circle = Shape.Circle(3.2f)
    var square = Shape.Square(4)
    var rectangle = Shape.Rectangle(6, 4)

    eval(circle)
    eval(square)
    eval(rectangle)


}