fun main() {
    val array = intArrayOf(1, 1, 2, 2, 2,2, 4, 5, 7, 7)
    val k = 4
    var currentIndex=0
    var count =0
    while (currentIndex < array.size) {
        count = 1
        for (index in currentIndex+1 until array.size) {
            if (array[currentIndex] == array[index]) {
                count++
            }else{
                break
            }
        }
        if (count == k) {
            for (i in currentIndex until currentIndex + k) {
                array[i] = 0
            }
        }
        currentIndex+=count

    }
    println(array.joinToString())
}