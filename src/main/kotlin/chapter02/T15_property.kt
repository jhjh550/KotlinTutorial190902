package chapter02

fun main() {
    val user = User4()
    user.name = "kotlin"
    println(user.name)
}

class User4{
    var name: String = "hello"
        get() = field.toUpperCase()
        set(value) { field = "this is $value"}

    var age:Int = 20
        set(value) {
            field = if(value>0) value else 0
        }


}