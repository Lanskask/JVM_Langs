/**
 * Created by a1 on 26.05.17.
 */

package demo

fun main(args: Array<String>) {
    var fName: String = "Doug"
    var lName: String = "Smith"

    var longStr = """lorem text
its a big big text or not. let's check

"""

    fName = "Sally"
    var fullName = fName + " " + lName
    println("Name: $fullName")
    println("1 + 2 = ${1+2}")
    println("String Length: ${longStr.length}")
    println("String Length Trimed: ${longStr.trim().length}")

    var str1 = "rand string 1"
    var str2 = "rand string 2"
    println("Is strings equal: ${str1==str2}")
    println("Compare A and B: ${'A'.compareTo('B')}")
    println("Compare A and B: ${"A".compareTo("B")}")

    println("2nd Index in str1 ${str1[2]} or/and ${str1.get(2)}")
    println("Index 2 - 7: ${str1.subSequence(2, 8)}")
    println("Str \"$str1\" Contains \"rand\": ${str1.contains("rand")}")
}
