package BankProgram

 class Bank {
    var accNo : Long = 0
    var name: String = ""
    var balance : Double = 0.0

    fun Data(accNo: Long, name: String, balance: Double) {
        this.accNo = accNo
        this.name = name
        this.balance = balance
    }

    fun deposit(deposit: Double, balance: Double){
        this.balance += deposit
    }
    fun withdraw(withdraw: Double, balance: Double){
        this.balance -= withdraw
    }

}
