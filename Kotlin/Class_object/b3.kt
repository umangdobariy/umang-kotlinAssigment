package Assigment.Class_object

data class person(var name:String,var age:Int)

fun main() {
    var data=person("umang dobariya", 20)
    println("name : ${data.name}")
    println("age :${data.age}")
}