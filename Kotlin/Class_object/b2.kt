package Assigment.Class_object


data class data1 (var name:String,var age:Int ) {
}
fun getdata1():data1{
    return  data1("umang dobariya",20)
}
fun main() {
    var obj= getdata1()
    println("name :  ${obj.name}")
    println("name :  ${obj.age}")
    var (name,age) = getdata1()
    println("name is $name")
    println("name is $age")
}