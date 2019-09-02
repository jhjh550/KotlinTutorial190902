package chapter02

class MyClass1{ }
class MyClass2(){ }
class MyClass3 constructor(){ }

class MyUser1 constructor(name: String, var age: Int = 0){
    val myName: String = name
    init {
        println(name)
    }
    fun sayHello(){
        println("hello $myName $age")
    }
}