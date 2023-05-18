package String

fun main() {
    var ch = charArrayOf('h','e','l','l','o')

    val string =  String(ch)

    println(string)

    //length ->

    var name = "AbhishekSoni"

    println(name[name.length-1])

    //String toMargin() ->

    var greeting = """Welcome
        |Hello sir
        |How are you?
    """.trimMargin()

    println(greeting)

}