fun main() {
    val array = intArrayOf(1, 2, 3, 4, 4, 4, 5, 5, 5, 5, 6)
    var count = 0
    println("total count of the array is ${array.size}")
    for (index in 1 until array.size) {
        if (array[index] == array[index - 1]) {
            count++
        }
    }
    println("Arraydagi farqli elementlar soni ${array.size-count}")
}