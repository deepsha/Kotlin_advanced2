fun main(args: Array<String>) {
    println("This is example of interface")
    val car=Motorcar()
    car.start()
    car.stop()
    println(car.type)
}
interface Vehicle {
    val type:String
        get() = "4 wheelers"
    fun start()
    fun stop()
}

class Motorcar : Vehicle {
    override val type: String="Car"//property attribute overriden in derived class

    override fun start()
    {
        println("Motorcar started")
    }

    override fun stop()
    {
        println("Motorcar stopped")
    }
}