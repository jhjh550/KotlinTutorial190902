package chapter02

val obj1 = object {
    var no:Int = 10
    fun myFun(){
        println("hello world")
    }
}

open class SomeClass{
    fun someClassFun(){
        println("some class function")
    }
}
interface SomeInterface{
    fun someInterfaceFun()
}
val obj2: SomeClass = object: SomeClass(), SomeInterface{
    override fun someInterfaceFun() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}

object obj3{
    fun myFun(){
        println("ObjectClass myFun")
    }
}

class MyClass4{
    companion object {
        fun myFun(){
            println("companion object myFun")
        }
    }
}

fun main() {
    obj3.myFun()
    MyClass4.myFun()
}


