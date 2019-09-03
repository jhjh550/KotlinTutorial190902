package chapter03

fun normalFun(a:Int, b:Int):Int{
    return a+b
}

fun hoFun(a:Int, b:(Int)->Int):Int{
    val res = b(10)
    println("a: $a, res: $res")
    return res
}

fun hoFun2(b:(Int)->Int):Int{
    val res = b(10)
    println("res: $res")
    return res
}

fun hoFun3(str:String):(a:Int,b:Int)->Int{
    when(str){
        "-"-> return {a,b->a-b}
        "+"-> return {a,b->a+b}
        "*"-> return {a,b->a*b}
        else-> return {a,b->a/b}
    }
}

fun main() {
    val result = hoFun3("+")
    val value = result(10,2)
    println("value : $value")
    hoFun(10) { x->x*100}
    hoFun2 { x->x*10 }
}