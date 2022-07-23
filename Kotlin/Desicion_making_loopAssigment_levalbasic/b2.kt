package Assigment.Desicion_making_loopAssigment_levalbasic


fun main() {
    println(
        """
        enter the choice:
        1) EN
        2) FR
        3) IT
    """
    )
    println("enter the choice :")
    var choice = readLine()!!.toInt()
    when (choice) {
        1 -> println("hello")
        2 -> println("salut")
        3 -> println("ciao")
    }

}