fun main() {
    val array = arrayOf(1, 2, 3, 4, 5, 6, 7, 8,9)
    for (index in 0 until array.size / 2) {
        println(array[index])
        println(array[array.size - 1 - index])
    }
    if (array.size % 2 == 1) {
        println(array[array.size / 2])
    }
}