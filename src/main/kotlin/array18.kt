fun main() {
    val array = intArrayOf(4, 2, 1, 8, 3)
    for (item in array) {
        if (item < array.last()) {
            println(item)
            break
        }
    }
}