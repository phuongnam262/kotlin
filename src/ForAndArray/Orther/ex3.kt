package ForAndArray.Orther

fun convertMoney(money: Int, option: Int): Int {
    var total = money
    when (option) {
        1 -> total *= 22700
        2 -> total /= 22700
    }
    return total
}

fun main() {
    print("1. Đổi qua nước ngoài, 2:Đổi qua VN: ")
    val option = readln().toInt()
    if (option == 1 || option == 2) {
        println("Nhap so tien: ")
        val money = readln().toInt()

        println("Số tiền sau khi đổi: ${convertMoney(money, option)}")
    } else
        println("Không hợp lệ")

}