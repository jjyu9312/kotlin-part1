package chap04

fun main() {

    val result: Int
    val multi = {a: Int, b: Int -> a + b} // 매개변수 -> 반환할 식
    val multi2: (a:Int, b:Int) -> Int = {a, b -> // 반환 값 없게 하려면 Unit 사용
        println("a: $a, b: $b")
        a * b
    } // 위와 같은 결과 반환

    result = multi(2, 3)
    val result2 = multi2(2, 3)

    println(result)
    println(result2)

    val nestedLambda: () -> () -> Unit = { { println("nestedLambda") } }
}