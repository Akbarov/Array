fun main() {
    val array = intArrayOf( 3, 4, 5, 6, 7, 7, 2, 3, 5, 5)
    val result = IntArray(array.size)
    var counter =0
    for (index in 1 until array.size step 2) {
        if (array[index] == array[index - 1]) {
            result[counter++] = array[index]
        }else{
            result[counter++] = array[index-1]
            result[counter++] = array[index]

        }
    }
    for (index in 0 until counter) {
        println(result[index])
    }
}