import oops.Registration

fun main(args: Array<String>) {
    println("This is example of OOPS ")
    val myCar = Car("Toyota","Camry",2020)
    println(myCar.getInfo())
    //inner class
    val engine = myCar.Engine()
    engine.horsepower = 250
    engine.cylinders = 6
    println(engine.getEngineInfo())
    //// accessing member of Nested class
    //By default nested class is static so we can access the nested class property or
    // variables using dot(.) notation without creating an object of the class.
    println(Car.nestedClass().firstName)
    println(Car.nestedClass().lastName)
    //calling inner method from inner class
    println(Car.nestedClass().getFullName("kumar"))//PraveenkumarRuhil

    //call registration class from here
    val registerUser= Registration("abc@gmail.com","Geeks@123",25,'M')
    println("${registerUser.email_id}/{${registerUser.password}} is ${registerUser.age} years old ${registerUser.gender} ")
    // registerUser.password = "abc"

    // throw IllegalArgumentException("Age should be 18+")
    // registerUser.age= 5

    // throw IllegalArgumentException("User should be male")
    // registerUser.gender = 'F'
}

class Car(var make: String, var model: String, var year: Int){

    fun getInfo(): String {
        return "this is $make $model, year $year"
    }
    inner class Engine {
        var horsepower: Int = 0
        var cylinders: Int = 0
            get() = field        // getter
            set(value) {         // setter
                field = value
            }
        fun getEngineInfo(): String {
            return "$horsepower horsepower, $cylinders cylinders, in a $make $model"
        }
    }
    class nestedClass {
        val firstName  = "Praveen"
        val lastName = "Ruhil"
        fun getFullName(middlename: String): String {
            var fullname = firstName.plus(middlename).plus(lastName)
            return fullname
        }
    }
}