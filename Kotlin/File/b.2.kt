package Assigment.File

import java.io.FileReader


class Filereadwrite1
{
    private val filename="text2.txt"

    fun readfile(){
        var reader= FileReader(filename)
        val msg=reader.readText()
        reader.close()
        println(msg)
    }

}

fun main() {
    val frw1=Filereadwrite1()
    frw1.readfile()
}