package Assigment.arrays


fun main() {
    var array= arrayOf(4,6,8,5,9,3,6,9)
    var sum=0

    for(i in array){
        sum=sum+i
    }
    var avg=sum/array.size
    println("avg :- $avg")
}
