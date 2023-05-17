package Functions

fun main() {

    var lb : (a:Int) -> Unit = {
        if (it%2==0){
            println("Even")
        }else{
            println("Odd")
        }
    }
    lb(5)

}