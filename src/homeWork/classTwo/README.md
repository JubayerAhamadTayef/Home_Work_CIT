# Class 2 Home Work!
## Kotlin Code of this Two_Function_With_Parameter.kt file:
```
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
```

## Output of this Two_Function_With_Parameter.kt file:

```
"C:\Program Files\Java\jdk-21\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.1.4\lib\idea_rt.jar=57053:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.1.4\bin" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath "C:\Users\Jubayer Ahamad Tayef\IdeaProjects\HomeWorkCIT\out\production\HomeWorkCIT;C:\Users\Jubayer Ahamad Tayef\.m2\repository\org\jetbrains\kotlin\kotlin-stdlib\2.0.0\kotlin-stdlib-2.0.0.jar;C:\Users\Jubayer Ahamad Tayef\.m2\repository\org\jetbrains\annotations\13.0\annotations-13.0.jar" homeWork.classTwo.Two_Function_With_ParameterKt

Student Name is: Jubayer Ahamad Tayef
Student Age is: 20
Student Roll is: 24060110
Student Course Name is: M IAAPP
Student batch Number is: 2401

Teacher Name is: Sadek Bhuiya Shimon
Teacher Age is: 25

Process finished with exit code 0
```
## Kotlin Code of this Mathematical_Operation.kt file:
``` 
package homeWork.classTwo

fun main(){
    println()
    println("This output from: Parameter Wise Function")
    summation(20, 30)
    subtraction(30, 20)
    multiplication(20,50)
    division(50.0, 20.0)
    modules(100, 50)

    println()
    println("This output from: Mathematical Operation Function")
    mathematicalOperation()
}

fun summation(firstNumber : Int, secondNumber : Int){
    val summation = firstNumber + secondNumber
    println("The summation is: $summation")
}

fun subtraction(firstNumber: Int, secondNumber: Int){
    val subtraction = firstNumber - secondNumber
    println("The subtraction is: $subtraction")
}

fun multiplication(firstNumber: Int, secondNumber: Int){
    val multiplication = firstNumber * secondNumber
    println("The multiplication is: $multiplication")
}

fun division(firstNumber: Double, secondNumber: Double){
    val division = firstNumber / secondNumber
    println("The division is: $division")
}

fun modules(firstNumber: Int, secondNumber: Int){
    val modules = firstNumber % secondNumber
    println("The modules is: $modules")
}

fun mathematicalOperation(){
    val firstNumber = 100
    val secondNumber = 50

    val summation = firstNumber + secondNumber

    val subtraction = firstNumber - secondNumber

    val multiplication = firstNumber * secondNumber

    val division = firstNumber / secondNumber

    val modules = firstNumber % secondNumber

    println("The summation is: $summation")

    println("The subtraction is: $subtraction")

    println("The multiplication is: $multiplication")

    println("The division is: $division")

    println("The modules is: $modules")
}
```
## Output of this Mathematical_Operation.kt file:
``` 
"C:\Program Files\Java\jdk-21\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.1.4\lib\idea_rt.jar=57113:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.1.4\bin" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath "C:\Users\Jubayer Ahamad Tayef\IdeaProjects\HomeWorkCIT\out\production\HomeWorkCIT;C:\Users\Jubayer Ahamad Tayef\.m2\repository\org\jetbrains\kotlin\kotlin-stdlib\2.0.0\kotlin-stdlib-2.0.0.jar;C:\Users\Jubayer Ahamad Tayef\.m2\repository\org\jetbrains\annotations\13.0\annotations-13.0.jar" homeWork.classTwo.Mathematical_OperationKt

This output from: Parameter Wise Function
The summation is: 50
The subtraction is: 10
The multiplication is: 1000
The division is: 2.5
The modules is: 0

This output from: Mathematical Operation Function
The summation is: 150
The subtraction is: 50
The multiplication is: 5000
The division is: 2
The modules is: 0

Process finished with exit code 0
```
## Kotlin Code of this Name_Age_Stage_Using_If_Else.kt file:
``` 
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
```
## Output of this Name_Age_Stage_Using_If_Else.kt file:
``` 
"C:\Program Files\Java\jdk-21\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.1.4\lib\idea_rt.jar=57152:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.1.4\bin" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath "C:\Users\Jubayer Ahamad Tayef\IdeaProjects\HomeWorkCIT\out\production\HomeWorkCIT;C:\Users\Jubayer Ahamad Tayef\.m2\repository\org\jetbrains\kotlin\kotlin-stdlib\2.0.0\kotlin-stdlib-2.0.0.jar;C:\Users\Jubayer Ahamad Tayef\.m2\repository\org\jetbrains\annotations\13.0\annotations-13.0.jar" homeWork.classTwo.Name_Age_Stage_Using_If_ElseKt

Name: Jubayer Ahamad Tayef, Age: 21, Jubayer Ahamad Tayef is ready for marry!

Process finished with exit code 0
```
