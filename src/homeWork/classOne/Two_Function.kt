package homeWork.classOne

fun main(){

    println() // It's create a new empty line, I use this for better view!

    myInformation() // Here My Information!

    println()

    myFriendInformation() // Here My Friend Information!

}

fun myInformation(){

    val myFirstName : String = "Jubayer"
    val myMiddleName = "Ahamad"
    val myLastName = "Tayef"
    val myFullName = "$myFirstName $myMiddleName $myLastName"

    var myAge = 19
    myAge += 1

    val myHeight = 5.6

    val myWeight = 72

    println("My Name is: $myFullName")

    println("My Age is: $myAge")

    println("My Height is: $myHeight")

    println("My Weight is: $myWeight")
}

fun myFriendInformation(){

    val myFriendFirstName : String = "Tonmoy"
    val myFriendLastName = "Deb"
    val myFriendFullName = "$myFriendFirstName $myFriendLastName"

    var myFriendAge = 21
    myFriendAge += 1

    val myFriendHeight = 5.7

    val myFriendWeight = 75

    println("My Friend Name is: $myFriendFullName")

    println("My Friend Age is: $myFriendAge")

    println("My Friend Height is: $myFriendHeight")

    println("My Friend Weight is: $myFriendWeight")
}