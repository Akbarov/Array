fun main() {
    var array = IntArray(20) { i -> i }
    println(array.joinToString())
    val startIndex = 5
    val endIndex = 8
    val newArray = IntArray(19)
    for (index in newArray.indices) {
        newArray[index] = array[index]
    }
    println(newArray.joinToString())


}