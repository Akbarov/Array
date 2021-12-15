fun main() {
    val array = intArrayOf(12, 3, 4, 5, 7, 8, 83)
    var size = array.filter { it % 2 == 1 }.count()
    val oddArray = IntArray(size)
    var count = 0
    for (item in array) {
        if (item % 2 == 1) {
            oddArray[count++] =item
        }
    }
    val evenArray = array.filter { it % 2 == 1 }
    println(evenArray.joinToString())
}