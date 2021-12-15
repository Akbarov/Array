import kotlin.math.pow

fun main() {
    val array = IntArray(10,{n->2*n+1})

    for ((index,item) in array.withIndex()) {
        println("$index -> $item")
    }

}
