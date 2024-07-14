package homeWork.classThree

fun main() {

    when_user_define_variable()

}

fun when_user_define_variable() {

    print("\nEnter Your Name: ") // \n create a new blank line. It's make my code's output better readable.
    val yourName = readln()
    println("Your Name is: $yourName\n")

    print("Enter Your Age: ")
    val yourAge = readln().toInt()
    println("Your Age is: $yourAge\n")

    print("You have money? Please, answer true or false: ")
    val youHaveMoney = readln().toBoolean()
    println("You have money? Answer: $youHaveMoney\n")

    when (youHaveMoney) {
        true -> {

            print("How much money you have? Please, answer a valid Integer value: ")
            val money = readln().toInt()
            println("You have $money taka only!\n")

            print("Are you hungry? Please, answer true or fales: ")
            val isHungry = readln().toBoolean()
            println("Are you hungry? Your Answer: $isHungry\n")

            when (isHungry) {
                true -> {

                    when {
                        money < 0 -> {

                            println("You have a loan! You have $money taka only! First clear it.")

                        }
                        money == 0 -> {

                            println("You have no money! You have $money taka only! So, you can drink water which water is open/free or you also eat air!")

                        }
                        money in 1..10 -> {

                            print("Can you like Chocolate? Please answer true or false: ")
                            val likeChocolate = readln().toBoolean()
                            println("Can you like Chocolate? Your answer: $likeChocolate\n")

                            when (likeChocolate) {
                                true -> {

                                    println("You have some money! You have $money taka only! Can you like chocolate? Your answer: $likeChocolate. So, you can eat chocolate.")

                                }
                                else -> {

                                    println("You have some money! You have $money taka only! Can you like chocolate? Answer: $likeChocolate. So, you can eat anything else without chocolate.")

                                }
                            }

                        }
                        money in 11..50 -> {

                            print("Can you like cold drink? Please answer true or false: ")
                            val likeColdDrink = readln().toBoolean()
                            println("Can you like cold drink? Your answer: $likeColdDrink\n")

                            when (likeColdDrink) {
                                true -> {

                                    println("You have some money! You have $money taka only! Can you like cold drink? Answer: $likeColdDrink. So, you can drink a cold drink.")

                                }
                                else -> {

                                    println("You have some money! You have $money taka only! Can you like cold drink? Your answer: $likeColdDrink. So, you can eat anything else without cold drink.")

                                }
                            }

                        }
                        money in 51..1000 -> {

                            println("You have some money! You have $money taka only! So, you can eat anything which price is under $money taka.")

                        }
                        money > 1000 -> {

                            println("You have a lot of money! You have $money taka! So, you can eat anything which price is under $money taka.")

                        }
                        else -> {

                            println("Something is wrong here!")

                        }
                    }

                }
                else -> {

                    println("You are not hungry! So, wait and eat when you are hungry.")

                }
            }
        }
        else -> {

            println("You have no money! First earn money or eat free food.")

        }
    }
}