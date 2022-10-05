fun main(){
    val amount: Int = 10000;
    println("Комиссия при переводе суммы: ${amount} руб. составит: ${transferFee(amount)} руб.");
}
fun transferFee(amount:Int): Double {
    val transferFee:Double = amount * 0.0075;
    if(transferFee > 35)
        return transferFee;
    else
        return 35.0;
}