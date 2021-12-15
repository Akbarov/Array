fun main() {
    val array = intArrayOf(2, 3, 5, 2, 4)
    var isSorted = true
    for (outerIndex in array.indices) {
        isSorted = true
        for (innerIndex in 0 until array.size - 1) {
            if (array[innerIndex] > array[innerIndex + 1]) {
                isSorted = false
                val temp = array[innerIndex]
                array[innerIndex] = array[innerIndex + 1]
                array[innerIndex + 1] = temp
            }
        }
        if (isSorted) {
            break
        }
        println(array.joinToString())
    }

    println("This is the result ")
    println(array.joinToString())
}