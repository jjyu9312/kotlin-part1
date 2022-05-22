package chap03.section1

fun main() {
    normalVarargs(1)
    println()
    normalVarargs(1,2,3,4)

}

fun normalVarargs(vararg a: Int) { // 인자가 하나 이상
    for (num in a) {
        print("$num ")
    }
}
