package ForAndArray


fun luythua(number1: Int, number2: Int): Int {
    var sum = 1;
    for (i in 1..number2) {
        sum *= number1
    }
    return sum
}

fun TongMu(number: Int): Int {
    var sum = 0;
    for (i in 1..number) {
        sum += luythua(i, 2)
    }
    return sum
}

//fun main() {
//    val number = 9
//    val result = TongMu(number)
//    println("result: $result")
//}