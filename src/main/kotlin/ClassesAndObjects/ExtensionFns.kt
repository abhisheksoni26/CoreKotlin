package ClassesAndObjects

fun main() {

    var arr = arrayOf(1,2,3,4,5,6)
    arr.isSwapped(2,5)
    for (i in arr){
        print(" " + i)
    }

    println()

    var arr1 = arrayOf<Int>()
    arr1.isSwapped(0,0)
    for (i in arr1){
        print(" " + i)
    }

}
//We should also add a nullable reciever ->
fun Array<Int>?.isSwapped(index1: Int, index2: Int): Any? {

    if (this == null){
        return null
    }
    else {

        val temp = this[index1]
        this[index1] = this[index2]
        this[index2] = temp

        return this

    }
}