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