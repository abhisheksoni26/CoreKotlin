package Functions

tailrec fun recursion(num: Long, semiCount: Long = 0) : Long{

    return if (num<=0){
        semiCount
    }else{
        recursion(num-1,semiCount+num)
    }

}
fun main() {

    var i: Long = 1000000

   var result = recursion(i)

    println("Sum will be : $result")


}