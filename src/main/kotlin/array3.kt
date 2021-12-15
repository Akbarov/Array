fun main() {
    val a = 1
    val d = 4
//    val array = IntArray(10, { n -> a + d * n })
//    println(array.joinToString())
    val array = IntArray(10)
//    array[0] = a
//    for (index in 1 until array.size) {
//        array[index] = array[index - 1] + d
//    }
    for (index in array.indices) {
        array[index] = a+d*index
    }
    for ((index, item) in array.withIndex()) {
        println("$index -> $item")
    }
}