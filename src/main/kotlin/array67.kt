fun main() {
    val array = intArrayOf(2, 3, 4, 35, 5, 45, 665, 6, 40)
    var lastOddNumber = -1
    for (index in array.size - 1 downTo 0) {
        if (array[index] % 2 == 1) {
            lastOddNumber = array[index]
            break
        }
    }
    for (index in array.indices) {
        if (array[index] % 2 == 1) {
            array[index]+=lastOddNumber
        }
    }
    println(array.joinToString())
}