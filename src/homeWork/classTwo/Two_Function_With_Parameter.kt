package homeWork.classTwo

fun main(){

    println() // It's print a new empty line, I use it for better view!

    studentInformation("Jubayer Ahamad Tayef", 20, 24060110, "M IAAPP", 2401)

    println() // It's print a new empty line, I use it for better view!

    teacherInformation("Sadek Bhuiya Shimon", 25) // Not sure!

}

fun studentInformation(name : String, age : Int, roll : Int, courseName : String, batchNumber : Int){

    println("Student Name is: $name")
    println("Student Age is: $age")
    println("Student Roll is: $roll")
    println("Student Course Name is: $courseName")
    println("Student batch Number is: $batchNumber")

}

fun teacherInformation(name : String, age : Int){

    println("Teacher Name is: $name")
    println("Teacher Age is: $age")

}