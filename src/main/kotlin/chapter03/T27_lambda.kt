package chapter03

fun sum(a:Int, b:Int): Int{
    return a+b
}
fun tempFun():Int{
    return 10+20
}

val tempFunLambda = { 10+20 }
val temp = ::sum
val sum1 = { a:Int, b:Int -> a+b }
val sum2 = { a:Int, b:Int ->
    println("hello world $a")
    a+b
}

fun main() {
    val res = sum(10,20)
    val res2 = temp(11,22)
    val res3 = sum1(22,33)
}