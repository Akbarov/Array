fun main() {
    val array = intArrayOf(2, 32, 5, 65, 7, 67, 87, 998)
    var firstEvenNumber = 0
    for(item in array) {
        if (item % 2 == 0) {
            firstEvenNumber = item
            break
        }
    }
    for (index in array.indices) {
        if (array[index] % 2 == 0) {
            array[index]+=firstEvenNumber
        }
    }
    println(array.joinToString())
}