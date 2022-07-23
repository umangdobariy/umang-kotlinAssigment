package Assigment.Collection

import java.util.*
import kotlin.collections.HashSet

fun main()
{
    var array = arrayOf("a","b","c")
    var set = HashSet(Arrays.asList(*array))

    println("set $set")
}