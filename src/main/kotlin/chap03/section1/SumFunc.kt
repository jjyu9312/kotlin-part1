package chap03.section1

fun main() {
    val result1 = sum(10, 20)
    println(result1)
    println("=======")
    val a = 3
    val b = 5
    val result2 = max(a, b)
    println(result2)
    println("=======")
    outfunc("genie")
}

fun sum(a: Int, b: Int): Int = a + b

fun max(a: Int, b: Int): Int {
    return if (a > b) a else b
}

fun outfunc(name: String): Unit { // return이 없는 형태 == void
    println("name: $name")
    // return Unit 숨겨져있음
}
