package ClassesAndObjects

fun main() {

    var arr1 = arrayListOf<String>("Abhishek", "Shubham", "Deep", "Viranch")

    printArray(arr1)

    var arr2 = arrayListOf<Int>(1,2,3,4,5)

    printArray(arr2)

    var arr3 = arrayListOf<Float>(2.1F, 3.5F, 5.3F, 12.3F)

    printArray(arr3)


}

fun <T>printArray(list: ArrayList<T>){

    for (element in list){
        println(element)
    }

}