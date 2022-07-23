package Assigment.Desicion_making_loopAssigment_levalbasic

fun main()
{
    var num = 20
    var factorial: Long = 1

    for (i in 1..num)
    {
        factorial = factorial * i;
    }
    println("Factorial of $num = $factorial")
}