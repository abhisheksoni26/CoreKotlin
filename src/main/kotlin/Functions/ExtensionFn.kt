package Functions

fun main() {
    var arr = arrayListOf<Int>(1,2,3,4,5,6,7,8,9,10).sepratingEven()
}

fun ArrayList<Int>.sepratingEven(): ArrayList<Int>{

    var resultArray = arrayListOf<Int>()

    for (i in this){
        if (i%2==0){
            resultArray.add(i)
        }
        else{
            continue
        }
    }
    return resultArray

}