package Arrays

import java.util.Arrays
import java.util.Scanner

val scanner = Scanner(System.`in`)
fun main() {

    addition()

}

fun CreateArrays(): Array<Array<Int>>{

    var rows  = scanner.nextInt()
    var columns = scanner.nextInt()

    return Array(rows){ Array(columns){ scanner.nextInt()} }


}

fun addition(){
    val firstMatrix = CreateArrays()
    val secondMatrix = CreateArrays()

    val sum = Array(4){IntArray(3)}

    for (i in 0 until 4) {
        for (j in 0 until 3) {
            sum[i][j] = firstMatrix[i][j] + secondMatrix[i][j]
        }
    }
    printArray(sum)
}

fun printArray(sum: Array<IntArray>){

    for (array in sum){
        for (value in array){
            print(" "+ value)
        }
        println()
    }

}