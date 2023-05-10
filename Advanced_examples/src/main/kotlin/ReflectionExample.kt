fun main(args: Array<String>) {
    println("This is example of Reflection API ")
    /*
    Features of Kotlin reflection –
    1.It gives access to properties and nullable types
    2.Kotlin reflection has some additional features to Java reflection.
    3.kotlin reflection helps in accessing the JVM code, written by a language
     */
    //Class Reference
// Reference obtained using class name
    val abc = ReflectionDemo::class
    println("This is a class reference $abc")

    // Reference obtained using object
    val obj = ReflectionDemo()
    println("This is a bounded class reference ${obj::class}")


    //FunctionReference
    //We can obtain a functional reference to every named function that is defined in Kotlin.
// This can be done by preceding the function name with the :: operator.
    fun add(a: Int,b: Int) : Int{
        return a+b;
    }

    fun add(a: String,b: String): String{
        return """$a$b"""
    }

    fun isDivisibleBy3(a: Int): Boolean{
        return a%3 == 0
    }
    // Function reference obtained using :: operator
    val ref1 = ::isDivisibleBy3
    val array = listOf<Int>(1,2,3,4,5,6,7,8,9)
    println(array.filter(ref1))

    // Function reference obtained for an overloaded function
    // By explicitly specifying the type
    val ref2: (String,String) -> String = ::add;
    println(ref2)

    // Function reference obtained implicitly
    val x = add(3,5)
    println(x)

    //Property References

    val z = ::fullname
    println(z.get())//George bush
    println(z.name) //fullname

    // Property Reference for a class property
    val y = Customer::customerName
    println(y.get(Customer("Tom hanks")))
    //constructor reference
    val t = ::Customer
    println(t.name)//<init>

}
// A sample empty class
class ReflectionDemo {
}

class Customer(var customerName: String){
}
val fullname="George bush"
