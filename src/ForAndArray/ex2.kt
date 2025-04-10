fun tinhUocVaTong(n: Int): Pair<Int, Int> {
    var demUoc = 0
    var tongUoc = 0

    for (i in 1..n) {
        if (n % i == 0) {
            demUoc++
            tongUoc += i
        }
    }

    return Pair(demUoc, tongUoc)
}

//fun main() {
//    val n = 12
//    val (soLuongUoc, tongUoc) = tinhUocVaTong(n)
//
//    println("Số lượng ước của $n là: $soLuongUoc")
//    println("Tổng các ước của $n là: $tongUoc")
//}
