fun main() {
    val a = intArrayOf(20, 19, 17, 16)
    val b = intArrayOf(9, 8, 5, 3)
    val c = intArrayOf(15, 12, 11, 10)
    val size = a.size
    val d = IntArray(a.size + b.size + c.size)
    if (c.first() < b.last() && b.first() < a.last()) {
        for (index in 0 until 4) {
            d[index] = c[size-1-index]
            d[size+index] = b[size-1-index]
            d[2*size+index] = a[size-1-index]
        }
    }else if(b.first() < c.last() && b.first() < a.last()){

    }

    println(d.joinToString())

}