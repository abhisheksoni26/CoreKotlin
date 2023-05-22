package ScopeFns

fun main() {

    var arr = arrayListOf<Int>(1,2,3,4,5)


    arr.also {
        it.add(6)
        it.add(7)
        it.remove(3)
        it.remove(2)

    }

    for (i in arr){
        print(" " + i)
    }


}