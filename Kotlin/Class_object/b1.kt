package Assigment.Class_object


class data constructor(var name :String) {

    init {
        println(" name :  $name")

    }
    fun greet(){
        println(" good morning umang !!")
    }

}

fun main() {
    var data=data("umang dobariya ")
    data.greet()
}