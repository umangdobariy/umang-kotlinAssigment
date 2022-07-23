package Assigment.File

import java.io.File

//WAP to check if file exist

fun main() {
    val file=File("create1.text")
    if(file.exists()){
        println("file is exist")
    }
    else{
        println("file is not exist")
    }
}