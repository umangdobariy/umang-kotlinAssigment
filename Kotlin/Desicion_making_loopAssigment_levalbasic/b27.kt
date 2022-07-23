package Assigment.Desicion_making_loopAssigment_levalbasic


fun main()
{
    val words = arrayOf("Kotlin", "C", "Python", "Java","Javascript")

    for (i in 0..2)
    {
        for (j in i + 1..3)
        {
            if (words[i].compareTo(words[j]) > 0)
            {
                val temp = words[i]
                words[i] = words[j]
                words[j] = temp
            }
        }
    }
    println("In Dictionary order:")
    for (i in 0..3)
    {
        println(words[i])
    }
}