package ForAndArray.Orther

fun findK(number: Int): Int {
    var count = 1;
    var k = 1;
    while (count <= number) {
        k++
        count += k
    }
    return k
}

fun main() {
    val number = 10
    println("so K= ${findK(number)}")
}