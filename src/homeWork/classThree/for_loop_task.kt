package homeWork.classThree

fun main(){
    for_loop_task()
}

fun for_loop_task(){

    print("\nEnter your favourite number or Enter which number Multiplication Table you like: ") // \n create a new blank line. It's make my code's output better readable.
    val yourNumber = readln().toInt()
    println("Your provided Number is: $yourNumber\n")

    println("Look, the Multiplication Table is ready depend on your provided number: ")
    for (i in 1..10) {
        println("$yourNumber x $i = ${yourNumber * i}")
    }
}