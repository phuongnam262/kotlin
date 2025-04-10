package ForAndArray

fun taoMangChuoi(): Array<String> {
    val tenGoc = "nlhdung"
    return Array(100) { i -> "$tenGoc-${i + 1}" }
}

//fun main() {
//    val mangChuoi = taoMangChuoi()
//
//    // In thử 10 phần tử đầu tiên
//    for (i in 0 until 10) {
//        println(mangChuoi[i])
//    }
//}
