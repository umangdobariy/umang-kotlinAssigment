package Assigment.arrays

fun main()
{
    println("enter the string which you want to convert in to the character")

    var str = readLine()!!
    var chr = arrayOfNulls<Char>(str.length)

    for (i in str.indices)
    {
        chr[i] = str[i]
    }
    println(chr.contentToString())
    var strResult = ""
    for (i in chr)
    {
        strResult += i
    }
    println(strResult)
}