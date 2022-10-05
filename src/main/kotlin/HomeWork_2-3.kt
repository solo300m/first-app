fun main(){
    val amount:Int = 10003;
    val buyerStatus:Boolean = true;
    println("Итоговая сумма к оплате с учетом всех скидок: ${discountCalc(amount,buyerStatus)}")
}

fun discountCalc(amount: Int, buyerStatus: Boolean): Double {
    var rez:Double = 0.0;
    if(amount <= 1000){
        rez = amount.toDouble();
    }
    else if(amount <= 10000 && amount >= 1001){
        rez = amount.toDouble() - 100;
    }
    else if(amount > 10001){
        rez = amount.toDouble() - amount * 0.05;
    }
    if(buyerStatus){
        rez = rez - rez * 0.01;
    }
    return rez;
}