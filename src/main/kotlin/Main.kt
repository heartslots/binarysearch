fun main() {
    doublesearch(0, 1024)
}

fun doublesearch(min: Int, max: Int) {
    val crossline = max - min
    val message = (max + min)/2

    if (crossline == 1) {
        println(max)
        return
    }

    println("${message} u or d, if answer is correct, d")
    val input = readLine()

    if (input == "u") {
        val min2 = min + (crossline)/2
        doublesearch(min2, max)
    } else if (input == "d") {
        val max2 = max - (crossline)/2
        doublesearch(min, max2)
    }
}