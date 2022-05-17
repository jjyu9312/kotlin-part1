package chap02.section3

fun main() {
    val a: Int = 128
    val b = a
    println("a == b : ${a == b}")
    println("a === b : ${a === b}")

    val c: Int? = a
    val d: Int? = a
    val e: Int? = c

    println("c == d : ${c == d}")
    println("c === d : ${c === d}")
    println("c === e : ${c === e}") // 같음 참조 주소를 가리킴
}