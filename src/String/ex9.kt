package String

fun countSubstring(s: String): Int {
    return Regex("nlhdung").findAll(s).count()
}

fun main() {
    val s = "nlhdun là nlhdng và nhdung"
    println("So lan xua hien nlhdung: " + countSubstring(s))
}