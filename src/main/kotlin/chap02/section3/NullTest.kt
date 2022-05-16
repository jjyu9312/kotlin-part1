package chap02.section3

fun main() {
    var str1: String?
    str1 = null
    val len = str1?.length ?: -1 // elvis 연산자 사용
    println("str1 = ${str1}, length = ${str1?.length}") // ?가 붙으면 null일 경우 뒤부분 실행 안함
    println("str1 = ${str1}, length = ${len}")
}