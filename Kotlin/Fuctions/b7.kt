package Assigment.Fuctions


fun main() {
    print("enter the number :")
    val number = readLine()!!.toInt()
    val sum = addNumbers(number)
    println("Sum = $sum")
}

fun addNumbers(num: Int): Int {
    if (num != 0)
        return num + addNumbers(num - 1)
    else
        return num
}
