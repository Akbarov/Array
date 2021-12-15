fun main() {
    val array = intArrayOf(2, 3, 5, 5, 3, 6, 0)
    var count = 0
    var outerIndex = 1
    outer@ while (outerIndex < array.size - count) {
        for (innerIndex in 0 until outerIndex) {
            if (array[outerIndex] == array[innerIndex]) {
                count++
                for (swipeIndex in outerIndex until array.size - 1) {
                    array[swipeIndex] = array[swipeIndex + 1]
                }
                continue@outer
            }
        }
        outerIndex++
    }
    for (index in 0 until array.size - count) {
        println(array[index])
    }
}