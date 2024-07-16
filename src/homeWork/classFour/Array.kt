package homeWork.classFour

fun main(){

    val myArray = arrayOf("Jubayer Ahamad Tayef", 20, true, 5.6)

    println()
    println("Complete array is: myArray = ${myArray.contentToString()}")

    println()
    for (j in myArray){
        println(j)
    }

    println()
    for (j in myArray.indices){
        println("Elements at index $j: ${myArray[j]}")
    }

    println()
    for ((index, value) in myArray.withIndex()){
        println("Index: $index = Elements: $value")
    }

}