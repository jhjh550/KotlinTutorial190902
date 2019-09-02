fun main() {
    val list1 = listOf<String>("hello", "world", "kotlin", "android")
    val iterator = list1.iterator()
    while(iterator.hasNext()){
        val res = iterator.next()
        println(res)
    }

    val myMap = mapOf<String, String>(
            "one" to "hello","two" to "world"
    )
    val iteratorMap = myMap.iterator()
    while (iteratorMap.hasNext()){
        val res = iteratorMap.next()
        println("${res.key} ${res.value}")
    }
}