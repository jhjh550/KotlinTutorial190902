package chapter02

interface MyInterface{
    fun myFun1()
    var data1:String
}

interface MyInterface2{
    fun myFun2()
}

class MyImplements: MyAbstract(), MyInterface, MyInterface2{
    override var name: String
        get() = TODO("not implemented") //To change initializer of created properties use File | Settings | File Templates.
        set(value) {}

    override fun myFun1() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override var data1: String
        get() = TODO("not implemented") //To change initializer of created properties use File | Settings | File Templates.
        set(value) {}

    override fun myFun2() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}