fun main() {
    val array = intArrayOf(2, 32, 5, 65, 7, 67, 87, 998)

    for (index in 0 until array.size - 1 step 2) {
        val temp = array[index]
        array[index] = array[index + 1]
        array[index + 1] = temp
    }
    println(array.joinToString())
}