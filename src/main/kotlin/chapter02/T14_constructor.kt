package chapter02

fun main() {
//    val user = MyUser3("hello", 11)
//    val user2 = MyUser3("kotlin")
    val user3 = MyUser3("android", 11, "hello@abc.com")
}

class MyUser3 (name:String){

    init {
        println("init block $name")
    }
    constructor(name1:String, age:Int) : this(name1){
        println("secondary constructor $name1 $age")
    }
    constructor(name:String, age:Int, email:String) : this(name, age){
        println("secondary constructor $name $age $email")
    }
}