fun main() {
    val array = IntArray(10,{i-> 10 * i})
//    for ((index, item) in array.withIndex()) {
//        println("$index -> $item")
//    }
    for (index in array.indices) {
        val reverse = array.size-1-index
        println("$reverse -> ${array[reverse]}")
    }
}