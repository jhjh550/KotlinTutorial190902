package chapter02
fun main() {
    val obj = MyOuter.MyNested()
//    val obj2 = MyOuter.MyInner()
}
class MyOuter{
    var no: Int = 10
    private val temp = MyInner()

    inner class MyInner{
        val name = "hello"
        fun myFun(){
            println("inner class $name $no")
        }
    }

    class MyNested{
        val name = "world"
        fun myFun(){
            println("nested class $name")
        }
    }
}