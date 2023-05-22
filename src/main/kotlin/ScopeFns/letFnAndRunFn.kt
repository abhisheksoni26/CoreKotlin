package ScopeFns

fun main() {

    var a: Int? = null


    //let function is often used to provide null safety calls. Use safe call operator(?.) with ‘let’ for null safety. It executes the block only with the non-null value.

    a?.let { // This block will not run ->
        println(it)
        println("Holaa!!!")
    }

    //OR

    a?.run {
        println(this)
    }

    a = 2

    a?.let {
        println(it)
        println("Let")
    }

    a?.run {
        println(this)
        println("Run")
    }
}