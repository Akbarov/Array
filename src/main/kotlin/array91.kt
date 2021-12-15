fun main() {
    val array = IntArray(20) { i -> i }
    val k = 5
    val h = 8
    val range = h - k + 1
    val newArray = IntArray(array.size - range)
    for (index in newArray.indices) {
        if (index >= k) {
            newArray[index] = array[index + range]
        } else {
            newArray[index] = array[index]
        }
    }

    println(array.joinToString())
    println(newArray.joinToString())

}