fun main(args: Array<String>) {
    println("This is example of Kotlin type checking->smart and explicit ")
    var name = "Praveen"
    var age = 24
    var salary = 5000.55
    val employeeDetails: List<Any> = listOf(name,age,salary)
// Kotlin does a smart casting.
    //We use is or !is operator to check the type of variable, and compiler
    // automatically casts the variable to the target type like this-
    for(attribute in employeeDetails) {
        if (attribute is String) {
            println("Name: $attribute")
        } else if (attribute is Int) {
            println("Age: $attribute")
        } else if (attribute is Double) {
            println("Salary: $attribute")
        }else if(attribute !is Float) {
            println("Float is null")
        }
        else {
            println("Not an attribute")
        }
    }

    /*
Explicit type casting can be done using :
Unsafe cast operator::as to cast a variable to target type.
Safe cast operator: as? If casting is not possible it returns null instead of throwing an
ClassCastException exception.

     */
    //Unsafe cast operator
    val line1: String = "explicit casting works fine"
    val line2: String = line1 as String      // Works
    println(line1)
    //safe cast operator
    var str1: Any = "Safe casting"
    val str2: String? = str1 as? String     // it works
    str1 = 11
    // type casting not possible so returns null to str3
    val str3: String? = str1 as? String
    val str4: Int? = str1 as? Int          // it works
    println(str2)
    println(str3)
    println(str4)
}