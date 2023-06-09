fun main(args: Array<String>) {
    println("This is example of nexted try block in exception handling")

        val numbers = arrayOf(1,2,3,4)

        try {
            for (i in numbers.indices) {
                try {
                    var n = (0..4).random()
                    println(numbers[i+1]/n)

                } catch (e: ArithmeticException) {
                    println(e)
                }
            }
        } catch (e: ArrayIndexOutOfBoundsException) {
            println(e)
        }
    }


