package chap02section2

fun main() {
    var str1: String = "hello"
    var str2 = "World"
    var str3 = "hello"

    println("str1 == str2 : ${str1 === str2}") // 메모리 공간 다름
    println("str1 == str3 : ${str1 === str3}") // 변수 이름만 다르고 메모리 공간은 같음
}