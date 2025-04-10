package ForAndArray

fun isPrime(n: Int): Boolean {
    if (n < 2) return false
    for (i in 2..Math.sqrt(n.toDouble()).toInt()) {
        if (n % i == 0) return false
    }
    return true
}

fun main() {
    val num1 = 7
    val num2 = 10
    val num3 = 13

    println("$num1 là số nguyên tố? -> ${isPrime(num1)}")
    println("$num2 là số nguyên tố? -> ${isPrime(num2)}")
    println("$num3 là số nguyên tố? -> ${isPrime(num3)}")
}

