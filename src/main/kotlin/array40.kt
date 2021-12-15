import kotlin.math.abs

fun main() {
    val array = intArrayOf(43, 25, 24, 5, 34, 11, 32, 42)
    val k = 8
    var difference = Int.MAX_VALUE
    var minValue = 0
    for (item in array) {
        if (abs(item - k) <= difference) {
            minValue = item
            difference = abs(item - k)
        }
    }
    println(minValue)
}