package Assigment.Desicion_making_loopAssigment_levalbasic

fun main()
{
    var falg = false

    println("enter the number ")
    var number: Int = readLine()!!.toInt()

    for (i in 2..number / 2)
                if (number % i == 0)
                    falg = true

    if (!falg)
        println("$number is a prime number.")
    else
        println("$number is not a prime number.")

}