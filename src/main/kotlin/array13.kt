fun main() {
    val array = intArrayOf(2,2,3,43,45,54,65,7,76,3,4)
    //4,76,65,45,3
    for (index in array.size - 1 downTo 0 step 2) {
        println(array[index])
    }
}