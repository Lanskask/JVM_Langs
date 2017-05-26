/**
 * Created by a1 on 26.05.17.
 */

package demo

fun main(args: Array<String>) {
    println("Hello World")

    var bigInt: Int = Int.MAX_VALUE
    var minInt: Int = Int.MIN_VALUE
    println("Bigest ang Smallest Int: $bigInt and $minInt")

    println("Bigest ang Smallest Doubl: ${Double.MAX_VALUE} and ${Double.MIN_VALUE}")

    if(true is Boolean) {
        print("Text\n")
    }

    var lett1: Char = 'A'
    println("A is a Char: ${lett1 is Char}")
    var lett2 = 'B'
    println("B is a Char: ${lett2 is Char}")

    println("3.14 to Int:" + (3.14.toInt()))
    println("A to Int:" + ('A'.toInt()))
    println("a to Int:" + ('a'.toInt()))
    println("65 to Char:" + (65.toChar()))
//    println("All text to Int:" + ("All text to Int:".toInt()))
    println("65 to Int:" + ("65".toInt()) + ("65".toInt() is Int))

}