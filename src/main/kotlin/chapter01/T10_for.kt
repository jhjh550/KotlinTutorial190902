package chapter01

fun main() {
    for(i in 1..10){
        println(i)
    }
    for(i in 1 until 10){
        println(i)
    }
    for(i in 10 downTo 1 step 2){
        println(i)
    }
    val list = listOf("Hello", "world", "kotlin", "android")
    for(str in list){
        println(str)
    }
}