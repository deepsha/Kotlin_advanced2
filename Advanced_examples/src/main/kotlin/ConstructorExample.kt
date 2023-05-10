import oops.Registration

fun main(args: Array<String>) {
    println("This is example of constructor (primary and secondary)")
    val user1 = User(1,"Peter",30,"male")
    println("${user1.name} is  ${user1.age} years old ${user1.gender} ")
    var product1=Products("Biscuit",2,3)
    var product2=Products("Biscuit",2,5,"Mario")
    var product3=Products("Biscuit",2,5,"Mario",2)

}
//primary constructor:using constructor key word is optional
class User constructor(user_id :Int=100,var name: String, var age: Int, var gender: String){
    val id: Int
    //what is init block?
//
//It acts as an initialiser block where member variables are initialised. This block gets executed whenever an instance of this class is created.
    init{
        println("This is first init block")
    }init{
        println("This is second init block")
    }
    //Initializer block is executed at the time of object creation, and not only initializes the properties but also prints to the standard output.
    init {
        println("This is third init block")
        id = user_id
        this.name = name
        print("user id is: $id, ")
        println("Name = $name")
    }
}
//Kotlin program of two secondary constructors in a class-
//class with one secondary constructor
class Products
{
    constructor(productName: String, productQuanity:Int,productPrice:Int)
    {
        var totalprice =productQuanity *productPrice
        println("The total price of product ${productName}: ${totalprice}")
    }

    constructor(productName: String, productQuanity:Int,productPrice:Int,brandName:String)
    {
        var totalprice =productQuanity *productPrice
        println("The total price of product  ${productName} of brand ${brandName}: ${totalprice}")
    }
    //Kotlin program of calling one constructor from another-
    constructor(productName: String, productQuanity:Int,productPrice:Int,brandName:String,tax:Int)
    {
        var totalprice =productQuanity *productPrice *tax
        println("The total price of product  ${productName} of brand ${brandName}: ${totalprice}")
    }
}