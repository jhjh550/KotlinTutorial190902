package chapter01

fun main() {
    val a = 200
    when(a){
        2 -> { println("value is 2")}
        1 -> println("hello world")
        else ->{
            println("value is not 1 or 2")
        }
    }
    val b = "hello"
    when(b){
        "hello" -> { println("hello")}
        "world" ->{ println("world")}
    }
    when(a){
        10,20 ->{}
        30,40 ->{}
        in 100..200 ->{}
    }

    val result = when(a){
        1-> "value is 1"
        else -> {
            println("when")
            "value is not 1"
        }
    }

    println(result)
}