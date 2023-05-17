package BankProgram

import java.util.Scanner
fun main() {

    var scanner = Scanner(System.`in`)
    var bank = Bank()

    bank.Data(78546655224485, "Abhishek Soni", 128000.0)

    println("""Welcome to UCO Bank
Hello, ${bank.name}
    """.trimMargin())

    println("Current Balance : ${bank.balance}")

    println()

    println("You want to deposit or withdraw (Say d/w)")

    var option = scanner.next()

    if (option.equals("d") || option.equals("D")){
        print("Deposit Amount:  ")
        var deposit = scanner.nextDouble()
        bank.deposit(deposit, bank.balance)
        println("Updated Balance: ${bank.balance}")
    }else if (option.equals("w") || option.equals("W")){
        print("Withdraw Amount:  ")
        var withdraw = scanner.nextDouble()
        bank.withdraw(withdraw, bank.balance)
        println("Updated Balance: ${bank.balance}")

    }else{
        println("Invalid Command !!")
    }

    println()
    println("Thank You for using our bank, See you soon!")


}