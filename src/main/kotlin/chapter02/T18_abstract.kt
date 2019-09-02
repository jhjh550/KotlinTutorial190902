package chapter02

abstract class MyAbstract{
    fun myFun(){ }
    abstract fun myFun2()
    abstract var name:String
}

class MyClass6: MyAbstract(){
    override var name: String
        get() = TODO("not implemented") //To change initializer of created properties use File | Settings | File Templates.
        set(value) {}

    override fun myFun2() { }



}