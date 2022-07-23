package Assigment.Collection


fun main(args: Array<String>) {

    var capitals = hashMapOf<Int, String>()
    capitals.put(101, "u")
    capitals.put(102, "m")
    capitals.put(103, "d")

    //print("value : ${capitals.values}")
    val result = capitals.toList().sortedBy { (_, value) -> value}.toMap()

    for (entry in result) {
        print("Roll no: " + entry.key)
        println(" Name: " + entry.value)
   }
    print("${capitals.toList().sortedBy{(_,value)->value}.toMap()}")
}