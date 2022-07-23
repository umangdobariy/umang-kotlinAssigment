package Assigment.Desicion_making_loopAssigment_levalbasic

fun main()
{

    println("enter the characater")
    var c = readLine()!!

    if (c in "a".."z" || c in "A".."Z")
        println("$c is an alphabet.")
    else
        println("$c is not an alphabet.")
}