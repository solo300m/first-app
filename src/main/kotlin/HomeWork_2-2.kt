fun main(){
    val like:Int = 61;
    println("Понравилось ${like} ${humanName(like)}");
}

fun humanName(like: Int): String {
    val likeArr:Array<String> = arrayOf("человеку","людям");
    val lastNumNumber:Int = like % 10;
    val lastDecNumber:Int = like % 100;
    if(lastNumNumber == 1 && lastDecNumber != 11 ){
        return likeArr[0];
    }
    else{
        return likeArr[1];
    }
}
