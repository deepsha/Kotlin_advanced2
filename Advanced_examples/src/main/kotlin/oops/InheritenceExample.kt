package oops

import oops.Registration

fun main(args: Array<String>) {
    println("This is example of inheritence")

    var item1=Items("Biscuit",3.1,3)
    item1.addItems()
    var item2=EssentailItems(3.3,"Biscuit",4.5,5)
    item2.addItems()
    var item3=NonEssentailItems(5.0,"Biscuit",5.5,5)
    item3.addItems()//overriding example

}
//base class
//In Kotlin, all classes are final by default. To permit the derived class to inherit from the base class, we must use the open keyword in front of the base class.
open class Items(itemName:String,itemPrice:Double,itemQuantity:Int){
    open val itemName:String
    open val itemQuantity:Int
    open val itemPrice :Double

    init{
        this.itemName=itemName
        this.itemQuantity=itemQuantity
        this.itemPrice=itemPrice
    }
    open fun addItems(){
        val total =itemQuantity*itemPrice
        println(" Bought product $itemName for $itemPrice per piece for  $itemQuantity and total price is $total")
    }


}
//dervied class
class EssentailItems(itemTax:Double, itemName: String, itemPrice: Double, itemQuantity: Int):
    Items(itemName, itemPrice, itemQuantity) {
    open val itemTax:Double
    init
    {
        this.itemTax=itemTax
    }
    override fun addItems() {
        super.addItems() //super keyword is used to call baseclass method
        val total =itemQuantity*itemPrice *itemTax
        println(" but tax need to be paid for essential product $itemTax and  total price is $total")
    }
}
//dervied class
class NonEssentailItems(itemDiscount:Double, itemName: String, itemPrice: Double, itemQuantity: Int):
    Items(itemName, itemPrice, itemQuantity) {
    open val itemDiscount:Double
    override var itemName = "Tiger"// //Kotlin program of overriding the member property from base class to derived class
    init
    {

        this.itemDiscount=itemDiscount
    }
    override fun addItems() {
        super.addItems()
        val total =(itemQuantity*itemPrice) -itemDiscount
        println(" but discount would be given for non-essential product $itemDiscount and  total price is $total")
    }
}