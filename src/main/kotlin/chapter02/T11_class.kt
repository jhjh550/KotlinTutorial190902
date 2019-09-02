package chapter02

fun main() {
    val obj = MyClass()
    obj.myFun()
}

class MyClass{
    val myVariable = 10
    fun myFun(){
        println("hello class")
    }
}