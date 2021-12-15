fun main() {

    val array = intArrayOf(2, 3, 4, 6, 5, 9, 10)
    var wrongIndex :Int = -1
    for (index in 1 until array.size){
        if (array[index] < array[index - 1]) {
            wrongIndex = index
            break
        }
    }
    for (index in wrongIndex downTo 1) {
        if (array[index] < array[index - 1]) {
            val temp = array[index]
            array[index] = array[index-1]
            array[index-1] = temp
        }else break

        println(index)
    }
    println(array.joinToString())



}