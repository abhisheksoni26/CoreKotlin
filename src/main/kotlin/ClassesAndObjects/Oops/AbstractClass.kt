package ClassesAndObjects.Oops

fun main() {
    var sbi = SBI()
    var sbiInt= sbi.simpleIntrest(5000,5.0,5)
    println(sbiInt)

    var pnb = PNB()
    var pnbInt= pnb.simpleIntrest(10000,4.5,3)
    println(pnbInt)

}

abstract class Bank{
    abstract fun simpleIntrest(p: Int, r: Double, t: Int): Double
}

class SBI: Bank(){
    override fun simpleIntrest(p: Int, r: Double, t: Int): Double {
        return (p*r*t)/100
    }
}

class PNB: Bank(){
    override fun simpleIntrest(p: Int, r: Double, t: Int): Double {
        return (p*r*t)/100
    }
}