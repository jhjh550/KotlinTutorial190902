package chapter02

class MyClass1{ }
class MyClass2(){ }
class MyClass3 constructor(){ }

class MyTempClass(name:String)
class MyTempClass2 constructor(val name:String)

class MyUser1 constructor(name: String, var age: Int = 0){
    val myName: String = name
    init {
        println(name)
    }
    fun sayHello(){
        println("hello $myName $age")
    }
}