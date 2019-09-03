package chapter02

fun main() {
//    val user = MyUser3("kotlin")
//    val user2 = MyUser3("android", 11)
    val user3 = MyUser3("hello", 11, "world")
}

class MyUser3(name:String){
    init {
        println("init block $name")
    }
    constructor(name:String, age:Int) : this(name) {
        println("secondary constructor $name $age")
    }
    constructor(name:String, age:Int, email:String) : this(name, age) {
        println("secondary constructor $name $age $email")
    }
}