fun main() {
    // Array
    var array = arrayOf(1,2,3, "hello")
    var array2 = arrayOf<Int>(1,2,3)
    var array3:Array<Int> = arrayOf(1,2,3)

    array[2]
    array.get(2)

    // List
    val myList:List<String> = listOf("hello", "world")
    val myList2:MutableList<String> =
        mutableListOf("hello1", "world1")
    myList2.add("kotlin")

    // Set
    val mySet = mutableSetOf<String>()
    mySet.add("hello")
    println(mySet.elementAt(0))

    // Map
    val myMap = mutableMapOf<String, String>()
    myMap.put("one", "helloMap")
    println(myMap.get("one"))
    println(myMap["one"])

}




