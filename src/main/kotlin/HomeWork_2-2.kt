fun main(){
    val like:Int = 62;
    println("Понравилось ${like} ${humanName(like)}");
}

fun humanName(like: Int): String {
    val lastNumNumber:Int = like % 10;
    val lastDecNumber:Int = like % 100;
    if(lastNumNumber == 1 && lastDecNumber != 11 ){
        return "человеку";
    }
    else{
        return "людям";
    }
}
