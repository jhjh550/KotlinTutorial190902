package chapter02

fun main() {
    val user = MyUser5()
    user.setData("hello@ab.com")
    println(user.email)
    println(user.name)
}

class MyUser5{
    lateinit var email:String
    val name: String by lazy {
        println("hello world")
        "hello"
    }

    fun setData(str:String){
        email = str
    }


}