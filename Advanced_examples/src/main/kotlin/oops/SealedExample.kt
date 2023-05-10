package oops

fun main(args: Array<String>) {
    println("This is example of sealed class")
    /*
    An abstract class may contain both abstract methods (methods without a body) and concrete methods (methods with a body).

     */
    val animal1=Animals.Domestic()
    animal1.feed()
    val animal2=Animals.Wild()
    animal2.feed()
    val animal3=Birds()
    animal3.feed()
    /*
    Note: All the subclasses of the sealed class must be defined within the same Kotlin file.
     However, it not necessary to define them within the sealed class, they can be defined in any scope where the sealed class is visible.
     */
}
//A sealed class Animal with a single subclass Domestic defined inside
sealed class Animals(val name:String){
    //Two subclass Domestic and Wild are defined within sealed class
    class Domestic:Animals("Cow"){
        //  class Duck:Domestic(){} Another subclass of the sealed class defined but it would throw error
        fun feed(){
            println("feeding domestic animals $name")
        }
    }
    class Wild:Animals("Giraffe"){
        fun feed(){
            println("feeding wild animals $name")
        }
    }

}
//a subclass defined outside sealed class
class Birds :Animals("Parrot"){
    fun feed(){
        println("feeding birds $name")
    }
}
