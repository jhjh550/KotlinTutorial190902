package chapter03

fun myFun(a:Int, b:Int):Boolean{
    return a>b
}
val lambdaFun: (Int,Int)->Boolean = {a:Int, b:Int -> a>b}

val lambdaFun2:(Int)->Int = { x -> x*10 }
val lambdaFun3:(Int)->Int = {
    it * 10
}
