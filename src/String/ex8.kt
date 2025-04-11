package String

fun chenStringX(mess: String, x: Int): String {
    return if (x in 0..mess.length) {
        mess.substring(0, x) + "nlhdung" + mess.substring(x)
    } else {
        "Vi tri khong hop le"
    }
}

//fun main() {
//    val mess = "hello"
//    val x = 6
//    val result = chenStringX(mess, x)
//    println("Result: $result")
//}