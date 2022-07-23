package Assigment.Collection

fun main()
{
    var list1 = ArrayList<String>()
    list1.add("umang")

    var list2 = ArrayList<String>()
    list2.add("montu")

    var joined = ArrayList<String>()

    joined.addAll(list1)
    joined.addAll(list2)

    println(joined)
}