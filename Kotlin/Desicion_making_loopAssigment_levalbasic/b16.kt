package Assigment.Desicion_making_loopAssigment_levalbasic

fun main()
{
    println("enter the number :")
    var number: Int = readLine()!!.toInt()

   var count = 0
    while (number>0)
    {
        count++
        number /=10

    }
    println("Total number of digits : $count")
}