package String

import kotlin.random.Random

fun randomHalfSubstring(s: String): String {
    if (s.isEmpty()) return ""

    val halfLength = s.length / 2
    if (halfLength == 0) return ""

    val maxStartIndex = s.length - halfLength
    val startIndex = Random.nextInt(0, maxStartIndex + 1)
    return s.substring(startIndex, startIndex + halfLength)
}

//fun main() {
//    val s = "KotlinLậpTrình"
//    val result = randomHalfSubstring(s)
//    println("Chuỗi gốc: $s")
//    println("Chuỗi con ngẫu nhiên 1/2: $result")
//}