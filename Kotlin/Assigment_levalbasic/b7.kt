package Assigment.Assigment_levalbasic

fun main(args: Array<String>) {

    print("Enter the num1: ")
    var num1:Int = readln()!!.toInt()

    print("Enter the num2: ")
    var num2:Int = readln()!!.toInt()

    println(" Quotient : ${num1/num2}")
    println(" Remainder : ${num1%num2}")
}