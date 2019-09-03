package chapter03

fun main() {
    val res = listOf(1,2,3)
        .map { it*10 }
        .reduce { acc, i -> acc+i }

    println(res)

    listOf(1,4,2).sortedBy { it % 2 }.forEach {
        println(it)
    }
}