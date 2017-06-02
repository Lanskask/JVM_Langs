/**
 * Created by a1 on 26.05.17.
 */

package demo

fun main(args: Array<String>) {
    var myArr = arrayOf(1, 1.23, 'a', "qwrrqr")
    println(myArr)
    println(myArr[2])
    myArr[1] = 3.14
    println("Arr length: ${myArr.size}")
    println("'a' in Array: ${myArr.contains('a')}")

    var partArr = myArr.copyOfRange(0, 2)
    println("First: ${partArr.first()}")
    println("'a' index in PartArr: ${partArr.indexOf('a')}")
    println("'a' index in AllArr: ${myArr.indexOf('a')}")

    var sqArray = Array(5, {x -> x * x})
    println("${sqArray[0]} ${sqArray[1]} ${sqArray[2]} ${sqArray[3]} ${sqArray[4]}")

    var arr2: Array<Int> = arrayOf(1, 2, 3)

}