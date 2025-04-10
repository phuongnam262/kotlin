package ForAndArray

fun CountOddAndOven(number: Int): Pair<Int, Int> {
    var num = number;
    var countOdd = 0;
    var countEven = 0;
    var temp = 0;
    while (num > 0) {
        temp = num % 10;
        if (temp % 2 == 0) countEven++ else countOdd++
        num /= 10;
    }
    return Pair(countEven, countOdd)
}

//fun main() {
//    val number = 19638;
//    val (even, odd) = CountOddAndOven(number)
//    println("Number of Even: $even \nNumber of Odd: $odd");
//}