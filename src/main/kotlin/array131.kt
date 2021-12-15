import kotlin.math.pow

fun main() {
    val x = 4
    val y = 3
    var minDistance = Double.MAX_VALUE
    val arrayX = intArrayOf(2, 3, 4, -3, 4, 5)
    val arrayY = intArrayOf(3, 1, 5, 7, -6, 2)
    if (arrayX.size == arrayY.size) {
        for (index in arrayX.indices) {
            val difX = (arrayX[index] - x).toDouble().pow(2.0)
            val difY = (arrayY[index] - y).toDouble().pow(2.0)
            val distance = (difX+difY).pow(0.5)
            println(distance)
            if (minDistance > distance) {
                minDistance = distance
            }
        }
    }
    println("Min distance = $minDistance")
}