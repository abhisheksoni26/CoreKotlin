//package ClassesAndObjects.Oops
//
//sealed class A{
//    class B : A()
//    {
//        class E : A() //this works.
//    }
//    class C : A()
//    init {
//        println("sealed class A")
//    }
//}
//
//class D : A() //this works
//{
//    class F: A() //This won't work,because sealed class is defined in another scope.
//}