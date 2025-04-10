fun isPrime(n: Int): Boolean {
    if (n < 2) return false
    for (i in 2..Math.sqrt(n.toDouble()).toInt()) {
        if (n % i == 0) return false
    }
    return true
}

fun findMaxValues(arr: IntArray): Quadruple<Int?, Int?, Int?, Int?> {
    val max = arr.maxOrNull()
    val maxEven = arr.filter { it % 2 == 0 }.maxOrNull()
    val maxOdd = arr.filter { it % 2 != 0 }.maxOrNull()
    val maxPrime = arr.filter { isPrime(it) }.maxOrNull()

    return Quadruple(max, maxEven, maxOdd, maxPrime)
}

// Kotlin không có sẵn kiểu Quadruple nên mình định nghĩa lại:
data class Quadruple<A, B, C, D>(val first: A, val second: B, val third: C, val fourth: D)
fun main() {
    val arr = intArrayOf(5, 8, 3, 12, 7, 9, 4, 14, 6, 11)

    val result = findMaxValues(arr)

    println("Giá trị lớn nhất: ${result.first}")
    println("Số chẵn lớn nhất: ${result.second}")
    println("Số lẻ lớn nhất: ${result.third}")
    println("Số nguyên tố lớn nhất: ${result.fourth}")
}
