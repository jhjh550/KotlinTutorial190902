package chapter03

class MyAddress{
    val city:String? = "seoul"
}
class MyUser8{
    val address: MyAddress? = MyAddress()
}

fun main() {
    val user:MyUser8? = MyUser8()
    val city1 = if(user != null){
        if(user.address != null){
            user.address.city
        }else{
            null
        }
    }else{
        null
    }
    val city2 = user?.address?.city



    var str:String? = "kotlin"

    val res1:Int? = if (str != null) { str.length }else{ null }
    val res2:Int? = str?.length
    val res3:Int = str!!.length

    val temp:Int? = 10
    val temp2:Int = temp ?: 0
    println(temp2)

    val myInt = str as? Int
    println(myInt)
}