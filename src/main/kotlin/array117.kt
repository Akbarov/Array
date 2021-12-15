fun main() {
    val array = intArrayOf(2, 2, 2, 2, 2, 4, 4, 4, 4, 5, 5, 5)
    val result = IntArray(array.size * 2)

    result[0] = 0
    result[1] = array.first()
    var count = 2
    for (index in 1 until array.size) {
        if (array[index] == array[index - 1]) {
            result[count++] = array[index]
        }else{
            result[count++] = 0
            result[count++] = array[index]
        }
    }
    println(result.joinToString())
}