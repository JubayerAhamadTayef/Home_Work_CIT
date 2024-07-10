# Class 1 Home Work!
## Kotlin Code:
```
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
```

## Output this Kotlin Code:
```
"C:\Program Files\Java\jdk-21\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.1.4\lib\idea_rt.jar=56861:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.1.4\bin" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath "C:\Users\Jubayer Ahamad Tayef\IdeaProjects\HomeWorkCIT\out\production\HomeWorkCIT;C:\Users\Jubayer Ahamad Tayef\.m2\repository\org\jetbrains\kotlin\kotlin-stdlib\2.0.0\kotlin-stdlib-2.0.0.jar;C:\Users\Jubayer Ahamad Tayef\.m2\repository\org\jetbrains\annotations\13.0\annotations-13.0.jar" homeWork.classOne.Two_FunctionKt

My Name is: Jubayer Ahamad Tayef
My Age is: 20
My Height is: 5.6
My Weight is: 72

My Friend Name is: Tonmoy Deb
My Friend Age is: 22
My Friend Height is: 5.7
My Friend Weight is: 75

Process finished with exit code 0
```