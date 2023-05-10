fun main(args: Array<String>) {
    println("This is example of Kotlin null safety  ")
    //We can use the safe call operator with let(), also() and run() if value is not null-
    //let() method –
    //To execute an action only when a reference holds a non-nullable value, we can use a let operator.
    // The lambda expression present inside the let is executed only if the variable firstName is not null.

    var fruits= listOf("Apple","Guava",null,"pineapple","orange")
    var newlist = listOf<String?>()
    for (item in fruits) {
        // executes only for non-nullable values
        item?.let { newlist = newlist.plus(it) }
        // executes only for non-nullable values
        item?.run { newlist = newlist.plus(this) } // this reference
        item?.also{it -> println(it)}// printing the non-nullable items of the list we can use an also() method
    }
    // newlist.forEach({t->println(t)})
    //elvis operator
    // The Elvis operator is used to return a non-null value or a default value when the original variable is null.
    var str : String?  = "world"
    println(str?.length)
    //not null assertion
    //The not null assertion (!!) operator converts any value to a non-null type and throws an exception if the value is null.
    var str1 : String?  = "world is beautiful"
    println(str1!!.length)
    var str2 = null
    //str2!!.length throw exception
}
