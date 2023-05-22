package Collections

fun main() {

    var arr = arrayListOf<Int>(1,2,3,4,5)

    var itr = arr.iterator()

    while (itr.hasNext()){
        println(itr.next())
    }


    var array = ArrayList<Int>(5)

    array.add(1)
    array.add(2)
    array.add(3)
    array.add(4)
    array.add(5)
    array.add(6)

    for (i in array){
        print(" " + i)
    }

    println("Removing element ->")

    array.remove(3)

    for (i in array){
        print(" " + i)
    }



    println("Removing element ->")

    array.removeAll(arr)

    for (i in array){
        print(" " + i)
    }
}

