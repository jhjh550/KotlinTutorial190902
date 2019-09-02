package chapter01

fun main() {
    val a = 5
    val b = if(a>10){
        10 + 20
    } else {
        println("if expression")
        20 + 20
    }

    //val c = 100 > 101 ? "hello" : "world"
    val c = if(100>101) "hello" else "world"



}