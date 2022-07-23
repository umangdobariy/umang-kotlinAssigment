package Assigment.File

import java.io.File


fun main() {
    val file= File("text1.text")
    if(file.delete()){
        println("file deleted")
    }
    else{
        println("file is not deleted")
    }
}