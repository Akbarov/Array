fun main() {
    val array = intArrayOf(3,43,43,34,42,32,1,21)
    var count = 0
    array.forEach { item->
        if (item % 2 == 0) {
            count++
        }
    }
    val tempArray = IntArray(count)
    count = 0
    array.forEach { item->
        if (item % 2 == 0) {
            tempArray[count++] = item
        }
    }
    tempArray.forEach {
        println(it)
    }

}