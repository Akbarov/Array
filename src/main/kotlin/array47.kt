fun main() {
    var array = intArrayOf(7, 4, 3, 2, 1, 4, 5, 2, 4, 7)
    outer@ for ((index, item) in array.withIndex()) {
        for (i in 0 until index) {
            if (item == array[i]) {
                continue@outer
            }
        }
        println(item)
    }
}