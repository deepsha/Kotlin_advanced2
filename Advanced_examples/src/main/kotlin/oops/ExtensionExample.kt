package oops
/*
Kotlin gives the programmer the ability to add more functionality to the existing classes,
 without inheriting them. This is achieved through a feature known as extensions. When a function is added to an existing class it is known as Extension Function. To add an extension function to a class, define a new function appended to the classname
 */
fun main(args: Array<String>) {
    println("This is example of extension  class")
    // Extension function created for a class Circle
    fun Circle.perimeter(): Double{
        return 2*Math.PI*radius;
    }
    // create object for class Circle
    val newCircle = Circle(2.5);
    // invoke member function
    println("Area of the circle is ${newCircle.area()}")
    // invoke extension function
    println("Perimeter of the circle is ${newCircle.perimeter()}")
    //calling companion function
    Circle.display()
}
class Circle (val radius: Double){
    // member function of class
    fun area(): Double{
        return Math.PI * radius * radius;
    }
    /*
    Companion Object Extensions
    If a class contains a companion object, then we can also define extension functions and properties for the companion object.
    Companion object declaration –

     */
    companion object {
        fun display(){
            println("Function declared in companion object")
        }
    }
}