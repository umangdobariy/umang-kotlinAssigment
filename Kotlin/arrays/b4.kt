package Assigment.arrays

fun main()
{
    var numarray = intArrayOf(10,20,45,3,76,34,21,90)
    var largest = numarray[0]

    for (num in numarray){
        if (largest < num )
            largest = num
    }
    println("largest number :$largest")
}