package ForAndArray

fun CountAndSum(num: Int): Pair<Int, Int> {
    var n = num
    var sum = 0;
    var count = 0;

    while (n > 0) {
        sum += n % 10
        count++
        n /= 10
    }
    return Pair(count, sum)
}
//
//fun main() {
//    val num = 1234;
//    val (count, sum) = CountAndSum(num)
//    println("So chu so: $count, Tong so chu so: $sum");
//}