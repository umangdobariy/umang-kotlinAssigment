package Assigment.Assigment_levalbasic


fun main()
{
    var element = "mon tu a vai ya"

    element = element.replace("\\s".toRegex(),"")

    println(element)


}