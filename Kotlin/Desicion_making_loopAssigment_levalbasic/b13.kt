package Assigment.Desicion_making_loopAssigment_levalbasic

fun main()
{
    var n1 = 81
    var n2 = 154

    while (n1 != n2) {
        if (n1 > n2)
            n1 -= n2
        else
            n2 -= n1
    }
    println("G.C.D = $n1")
}