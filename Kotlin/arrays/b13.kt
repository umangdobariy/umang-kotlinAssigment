package Assigment.arrays

import java.util.stream.IntStream

fun main()
{
     var num = intArrayOf(1,2,3,4,5,6,7)
     var tofind = 6

     val found = IntStream.of(*num).anyMatch { num -> num ==  tofind }

     if (found)
          println("$tofind is found")
     else
          println("$tofind is not found")
}