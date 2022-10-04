fun main(){
    val amount: Int = 1000;
    println("Комиссия при переводе суммы: ${amount} руб. составит: ${transferFee(amount)} руб.");
}
fun transferFee(amount:Int): Double {
    var transferFee:Double = amount * 0.0075;
    return transferFee;
}