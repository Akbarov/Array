fun main() {
    val array = intArrayOf(43, 43, 40, 3, 52, 10, 32, 43, 4, 34)
    var min = Int.MAX_VALUE
    for (index in 1 until array.size step 2) {
        if (min > array[index]) {
            min = array[index]
        }
    }
    println(min)
}