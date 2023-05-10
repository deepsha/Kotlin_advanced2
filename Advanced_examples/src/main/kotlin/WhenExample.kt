
fun isOdd(num: Int)=num%2!=0
fun isEven(num: Int)=num%2==0

fun main(args: Array<String>) {
    println("This is example of when usage")
    var str = """My
        |name
        |is
        |Kotlin
    """.trimMargin()
    println(str)    //Using when as a statement with else
    var name = "Sun"
    when (name) {
        "Sun" -> println("Sun is a Star")
        "Moon" -> println("Moon is a Satellite")
        "Earth" -> println("Earth is a planet")
        else -> println("I don't know anything about it")
    }
    //Using when as an expression
    var monthOfYear = 5
    var month = when (monthOfYear) {
        1 -> "January"
        2 -> "February"
        3 -> "March"
        4 -> "April"
        5 -> "May"
        6 -> "June"
        7 -> "July"
        8 -> "August"
        9 -> "September"
        10 -> "October"
        11 -> "November"
        12 -> "December"
        else -> "Not a month of year"
    }
    println(month)
    var num = 4
    when (num) {
        in 1..3 -> println("Spring season")
        in 4..6 -> println("Summer season")
        in 7..8 -> println("Rainy season")
        in 9..10 -> println("Autumn season")
        in 11..12 -> println("Winter season")
        !in 1..12 -> println("Enter valid month of year")
    }

//  Using when as a replacement for an if-else-if chain:
    when {
        isOdd(num)->println("odd")
        isEven(num)->println("even")
        else->println("neither odd or even")
    }
//Kotlin program to demonstrate the structural and referential equality –
    var x = "apple"
    var y = "apple"
    var z = "a"
    println(x===y) // true , as both are pointing to the same StringPool
    println(x==z) //false since values are not equal
    println(x===z)


}

