package Assigment.Fuctions

//WAP to check whether the number not lies in range. !in operator)
fun main() {
    var num=2
    if(num !in 5..10){
        println("$num is not lie within the range ")
    }else{
        println("$num is lie within the range")
    }
}