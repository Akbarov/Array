fun main() {
    val array = intArrayOf(1, 2, 3, 4, 5, 7, 7, 8)
    var d = 0
    for (index in 1 until array.size-1) {
        if (array[index] * 2 == array[index - 1] + array[index + 1]) {
            d = array[index]-array[index-1]
        }else{
            d = 0
            break
        }
    }
    println(d)
}