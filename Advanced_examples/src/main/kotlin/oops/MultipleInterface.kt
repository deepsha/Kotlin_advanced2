package oops

fun main(args: Array<String>) {
    println("This is example of multiple interface")
    val rectangle=Rectangle()
    rectangle.area()
    rectangle.perimeter()
    //multiple inheritence : Dimenson inherited by CalculateParameters,
    val colorRectangle=ColorRectangle()
    colorRectangle.area()
    colorRectangle.perimeter()
    colorRectangle.painted()
}
//base class
interface Dimensions  {
    val length : Double
    val breadth : Double
}
interface Colors{
    val color:String
    fun painted()
}
//derived class
interface CalculateParameters : Dimensions {
    fun area()
    fun perimeter()
}
//derived class
class Rectangle : CalculateParameters {
    override val length : Double
        get() = 10.0
    override val breadth : Double
        get()= 15.0

    override fun area()
    {
        println("Area of Rectangle is ${length * breadth}")
    }

    override fun perimeter()
    {
        println("Perimeter of Rectangle is ${2*(length+breadth)}")
    }
}
//multple interface:A class can implement more than one interface, provided that it provides a definition for all the members of the interface
class ColorRectangle:CalculateParameters,Colors{
    override val color: String
        get() = "Red"
    override val length : Double
        get() = 10.0
    override val breadth : Double
        get()= 15.0

    override fun painted() {
        println("color of  Rectangle is ${color}")
    }
    override fun area()
    {
        println("Area of color ${color} Rectangle is ${length * breadth}")
    }

    override fun perimeter()
    {
        println("Perimeter of color ${color} Rectangle is ${2*(length+breadth)}")
    }
}