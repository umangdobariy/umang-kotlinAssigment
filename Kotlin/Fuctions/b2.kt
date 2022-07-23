package Assigment.Fuctions

fun Start():String
{
    print("enter the name :")
    var name = readLine()!!
    println("name : $name")
    return name
}

fun main()
{
    Start()
}