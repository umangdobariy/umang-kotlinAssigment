package Assigment.Class_object.b4

data class User(val name: String, val age: Int)

fun main(args: Array<String>) {
    val u1 = User("umang dobariya", 20)

    // using copy function to create an object
    val u2 = u1.copy()
    println("u1: name = ${u1.name}, name = ${u1.age}")
    println("u2: name = ${u2.name}, name = ${u2.age}")
}