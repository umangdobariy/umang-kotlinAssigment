package Assigment.File

import java.io.File

fun main()
{
    var file = File("E:\\Assigment_file\\umang.txt")

    if (file.createNewFile())
    {
//        println("create file successfully")
    }
}