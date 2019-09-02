package chapter01

fun main() {
    val str1:Char = 'c'
    val str2:String = "c"

    val str3 = "Hello\nWorld"
    val str4 = """Hello
World"""

    println(str4)
    val myVal = 10

    println("hello $myVal")
    println("hello ${myVal+20}")
    println("hello ${sum(10, 11)}")
    println(getLength(100))
    println(getLength("hello world"))
}

fun getLength(obj: Any):Int{
    if(obj is String){
        return obj.length
    }
    return 0
}