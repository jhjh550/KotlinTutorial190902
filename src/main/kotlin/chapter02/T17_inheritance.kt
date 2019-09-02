package chapter02

open class MyShape{
    var x: Int = 0
    open var y: Int = 0
        set(value) { field = if(value<0) 0 else value }
    open fun myPaint(){
        println("location $x $y")
    }
}

class MyRect: MyShape() {
    override var y:Int = 100
    override fun myPaint(){

    }
}

