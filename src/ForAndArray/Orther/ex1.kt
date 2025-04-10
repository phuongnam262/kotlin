package ForAndArray.Orther

fun TinhTienTaxi(distance: Int): Int {
    var total = 0;
    when {
        distance <= 0 -> total = 0
        distance == 1 -> total = 15000
        distance in 2..5 -> total = 15000 + (distance - 1) * 13500
        distance in 6..120 -> total = 15000 + 4 * 13500 + (distance - 5) * 11000
        distance > 120 -> {
            total = 15000 + 4 * 13500 + (distance - 5) * 11000
            total = (total * 0.9).toInt()
        }
    }
    return  total
}
//fun main() {
//    print("Nhập số km đã đi: ")
//    val km = readLine()!!.toInt()
//
//    val tien = TinhTienTaxi(km)
//
//    println("Tiền taxi cho $km km là: ${"%,d".format(tien)} đ")
//}
