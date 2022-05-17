package chap02.section3

fun main() {
    var a: Any = 1 // Any형 a는 1로 초기화될 때 Int
    a = 20L // Int형인 a는 20L에 의해 Long으로 변환
    println("a: $a type: ${a.javaClass}")
}