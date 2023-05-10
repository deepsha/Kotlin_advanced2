package oops
/*
Generics are the powerful features that allow us to define classes, methods and properties which are accessible using different data types while
keeping a check on the compile-time type safety

 */
fun main(args: Array<String>) {
    println("This is example of generic  class")
    var companyName: Company<String> = Company<String>("Microsoft")
    var rank: Company<Int> = Company<Int>(12)
    var salary: Company<Double> = Company<Double>(200.70)
    var distance: Company<Long> = Company<Long>(3L)
}

class Company<T> (text : T){
    var x = text
    init{
        println(x)
    }
}