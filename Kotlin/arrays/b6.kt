//@file:JvmName("B7Kt")
//
//package Assigment.arrays
//
//fun main() {
//    var rows = 2
//    var coloum = 2
//
//    var firstmatrix = arrayOf(intArrayOf(5, 6), intArrayOf(7, 9))
//    var secondmatrix = arrayOf(intArrayOf(87, 90), intArrayOf(56, 98))
//
//    var sum = Array(rows) { IntArray(coloum) }
//    for (i in 0..rows - 1) {
//        for (j in 0..coloum - 1)
//            sum[i][j] = firstmatrix[i][j] + secondmatrix[i][j]
//
//    }
//
//    println("sum of two matrix  is :")
//
//    for (rows in sum) {
//        for (coloum in rows) {
//            println("$coloum")
//        }
//        println()
//    }
//
//}