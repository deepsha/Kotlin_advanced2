fun main(args: Array<String>) {
    println("This is example of function")
    println("the sum of ${sum(10,7)}")
    var result=minus(3,8)
    println("difference is :$result")
    var result1=multiply(3,6)
    println("multiply is :$result1")
    val(two,three)=TwoFunc(2) //return two output
    println("2, $two, $three")

    val result2 = { num:Int -> num *5}
    println("result is  $result2")

    var result3=factorial(5)
    println(" factorial of 5! is $result3")
    var  sum={x:Int ,y:Int->x+y}
    println(" 4+7= ${sum(4,7)}")
    var  multiply={x:Int ,y:Int->x*y}
    println(" 3*7= ${multiply(3,7)}")

    /*
    There are three cases for default arguments-
No arguments are passed while calling a function
Partial arguments are passed while calling a function
All arguments are passed while calling a function
         */
    val name_of_student = "Gaurav"
    val standard_of_student = "VIII"
    val roll_no_of_student = 25
    student()// passing no arguments while calling student
    student(name_of_student,standard_of_student)//  // passing only two arguments name and standard of student
    student(name_of_student,standard_of_student,roll_no_of_student) //passing all the arguments of student name,
    //standard and roll_no in same order as defined in function

    //to call anonymous function
    val sumAnonymous = anonymous1(3,5)
    println("The sum of two numbers is: $sumAnonymous")

    var a = 15
    var b = 12
    var c = 11
    // call using dot and parenthesis
    var output1 =(a > b).and(a > c)
    println("Boolean result1 = $output1")
    // call using infix notation
    var output2 =(a > b) and (a > c)
    println("Boolean result1 = $output2")
    // // call using infix notation
    var output3 = a shr 2
    println("Signed shift right by 2 bit: $output3")
    println(++a)      // call using infix notation
    println(a.inc())  // call using dot and parenthesis
    println(--b)      // call using infix notation
    println(b.dec())  // call using dot and parenthesis
//Kotlin program of lambda expression which returns Integer value
    higherfunc(lambda)
    //collection sorting
    val list = listOf(8, 4, 7, 1, 2, 3, 0, 5, 6 )
    val asc = list.sorted()
    println(asc)
    val desc = list.sortedDescending()
    println(desc)


}

// anonymous function with body as an expression
val anonymous1 = fun(x: Int, y: Int): Int = x + y


fun sum(a:Int,b:Int):Int{
    return a+b
}

fun minus(a:Int,b:Int):Int{
    if(a>b)
        return a-b
    else
        return b-a
}
fun multiply(a:Int,b:Int):Int{
    return a*b
}
fun TwoFunc(num:Int):Pair<Int,Int>{
    return Pair(num+1,num+2)
}
//recursive function
fun factorial(num:Int):Int{

    tailrec fun factorials(a:Int,b:Int):Int
    {
        if(a==0) return b
        else return factorials(a-1,a*b)
    }
    return factorials(num,1)
}
fun student(name: String="Praveen", standard: String="IX" , roll_no: Int=11) {
    println("Name of the student is: $name")
    println("Standard of the student is: $standard")
    println("Roll no of the student is: $roll_no")
}
// inlined function- we can use the inline keyword which ultimately requests the compiler to not allocate memory and simply copy the inlined code of that function at the calling place.
inline fun inlinedFunc( lmbd1: () -> Unit, lmbd2: () -> Unit  ) {
    lmbd1()
    lmbd2()
}

// lambda expression
var lambda = {a: Int , b: Int -> a + b }
// higher order function
fun higherfunc( lmbd: (Int, Int) -> Int) {      // accepting lambda as parameter

    var result = lmbd(2,4)    // invokes the lambda expression by passing parameters
    println("The sum of two numbers is: $result")
}