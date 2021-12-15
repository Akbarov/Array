fun main() {
    val array1 = intArrayOf(1, 2, 3, 4, 5, 6, 6, 7, 8, 8)
    val array2 = intArrayOf(3, 2, 1, 4, 5, 6, 6, 7, 8, 10)
    if (array1.size == array2.size) {
        for (index in array1.indices) {
            val temp = array1[index]
            array1[index] = array2[index]
            array2[index] = temp
        }
        println("array first = ${array1.joinToString()}")
        println("array second = ${array2.joinToString()}")
    }else{
        println("The size of the two array is not equal")
    }


}