package Assigment.arrays

fun main()
{
    val A = intArrayOf(1, 2, 3)
    val B = intArrayOf(4, 5)

    val concat = intArrayOf(*A, *B)

    println(concat.contentToString())        // [1, 2, 3, 4, 5]
}

