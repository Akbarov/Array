fun main() {
    val array = intArrayOf(12, 3, 4, 5, 6, 9, 7, 8, 8, 89)
    val k = 3
    val h = 6
    val size = (h-k+1)/2
    for (index in 0 until size) {
        val temp = array[k+index]
        array[k+index] = array[h-index]
        array[h-index] = temp
    }

    println(array.joinToString())
}