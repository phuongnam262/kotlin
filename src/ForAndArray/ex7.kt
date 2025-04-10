package ForAndArray

fun mergeSort(arr: IntArray): IntArray {
    if (arr.size <= 1) return arr

    val mid = arr.size / 2
    val left = mergeSort(arr.sliceArray(0 until mid))
    val right = mergeSort(arr.sliceArray(mid until arr.size))

    return merge(left, right)
}

fun merge(left: IntArray, right: IntArray): IntArray {
    val result = mutableListOf<Int>()
    var i = 0
    var j = 0

    while (i < left.size && j < right.size) {
        if (left[i] < right[j]) {
            result.add(left[i])
            i++
        } else {
            result.add(right[j])
            j++
        }
    }

    // Thêm phần còn lại
    while (i < left.size) {
        result.add(left[i])
        i++
    }

    while (j < right.size) {
        result.add(right[j])
        j++
    }

    return result.toIntArray()
}

fun main() {
    val mang = intArrayOf(5, 1, 4, 2, 3)
    val mangDaSapXep = mergeSort(mang)

    println("Mảng sau khi sắp xếp tăng dần: ${mangDaSapXep.joinToString(", ")}")
}
