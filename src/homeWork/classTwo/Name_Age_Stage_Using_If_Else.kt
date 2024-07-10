package homeWork.classTwo

fun main(){
    println()
    nameAgeStageUsingIfElse()
}

fun nameAgeStageUsingIfElse() {
    val myName = "Jubayer Ahamad Tayef"
    val myAge = 21
    val jobLess = false

    if(myAge<=0) {

        println("Name: $myName, Age: $myAge, Invalid Age!")

    } else if(myAge<=10) {

        println("Name: $myName, Age: $myAge, $myName is a Child!")

    } else if(myAge in 11..20) {

        println("Name: $myName, Age: $myAge, $myName is too young!")

    }  else if(myAge in 21..40) {

        if (!jobLess) {

            println("Name: $myName, Age: $myAge, $myName is ready for marry!")

        } else {

            println("Name: $myName, Age: $myAge, $myName is not ready for marry!")

        }
    } else if (myAge<50){

        println("Name: $myName, Age: $myAge, $myName is a father!")

    } else {

        println("Name: $myName, Age: $myAge, $myName is a grand father!")

    }
}