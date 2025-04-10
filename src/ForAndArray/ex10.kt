package ForAndArray
//cach 1
//fun doiXung(num: Int): Boolean {
//    var number = num
//    var template = 0
//
//    val arr = mutableListOf<Int>()
//    while (number > 0) {
//        template = number % 10
//        arr.add(template)
//        number /= 10
//    }
//    var i = 0;
//    var j = arr.size - 1
//
//    while (i < j) {
//        if (arr[i] != arr[j]) {
//            return false
//        }
//        i++
//        j--
//    }
//    return true
//}

//cach2
fun isPalindrome(n: Int): Boolean {
    val str = n.toString()
    return str == str.reversed()
}

//fun main(){
//    val number=1
////    if (doiXung(number)) println("doi xung ")else println("khong doi xung")
//    if (isPalindrome(number)) println("doi xung ")else println("khong doi xung")
//
//}