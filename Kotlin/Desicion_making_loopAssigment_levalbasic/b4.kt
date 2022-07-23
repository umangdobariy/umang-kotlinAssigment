package Assigment.Desicion_making_loopAssigment_levalbasic

fun main()
{
    print("enter frist number")
    var num1: Int = readLine()!!.toInt()
    print("enter second number")
    var num2: Int = readLine()!!.toInt()
    print("enter second number")
    var num3: Int = readLine()!!.toInt()

    val max=
    if (num1>num2 && num1<num3)
    {
        num1
    }else if (num2>num1 && num2<num3)
    {
        num2
    }else
    {
        num3
    }
    println("max is $max")
}