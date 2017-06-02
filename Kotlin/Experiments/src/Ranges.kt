/**
 * Created by a1 on 26.05.17.
 */

package demo

fun printArray(name: String, arrayToPr: IntProgression) {
    print("Array $name:" )
    for(x in arrayToPr) print("$x, ")
    println()
}

fun printArrayRev(name: String, arrayToPr: IntProgression) ={
    print("Array Reversed $name:" )
    for(x in arrayToPr.reversed()) print("$x, ")
    println()
}

fun main(args: Array<String>) {

    val oneToTen = 1..10

    val alphaBeta = "A".."Z"
    println("R in AlphB: ${"R" in alphaBeta}")

    val tenTo1 = 10.downTo(1)
    val twoTo20 = 2.rangeTo(20)
    val range3 = oneToTen.step(3)


    /*for(x in range3) print("rng3: $x, ")
    println()*/
    printArray("oneToTen", oneToTen)
    printArray("tenTo1", tenTo1)
    printArray("twoTo20", twoTo20)
    printArray("range3", range3)

    printArrayRev("range3", range3)
}
