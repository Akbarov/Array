fun main() {
    val array = intArrayOf(2, 3, 43, 5, 4, 65, 65, 76)
    val k = 3
    val ak = array[k]
    for (index in array.indices) {
        array[index] += ak
    }
    println(array.joinToString())
}