fun main(args: Array<String>) {
    println("This is example of comparator and comparable interface ")
    var employeeList= mutableListOf<Employee>(Employee("david","peter",30,200.2),
        Employee("Tom","Hanks",46,100.2),
        Employee("Peter","pan",27,207.2))

    var salarycomapre=SalaryComparator()
    employeeList.sortWith(salarycomapre)
    println(employeeList)
    var agecompare=AgeComapartor()
    employeeList.sortWith(agecompare)
    println(employeeList)
    var namecomparator=FirstnameComparator().reversed()
    employeeList.sortWith(namecomparator)
    println(employeeList)
    //pair example
    var pair = Pair("Hello world", "This is Kotlin tutorial")
    println(pair.first)
    println(pair.second)
    //triple example
    var triple = Triple("Hello world", "This is Kotlin tutorial","Lets try out")
    println(triple.first)
    println(triple.second)
    println(triple.third)

}
class Employee(val firstName: String,val lastName: String,val age:Int,val salary:Double){
    override fun toString(): String {
        return """$firstName $lastName ,$age, $salary"""
    }
}
// A comparator to compare age of Employee
class AgeComapartor: Comparator<Employee>{
    override fun compare(e1: Employee?, e2: Employee?): Int {
        if(e1 == null || e2 == null){
            return 0;
        }
        return e1.age.compareTo(e2.age)
    }
}

// A comparator to compare salary of employee
class SalaryComparator: Comparator<Employee>{
    override fun compare(o1: Employee?, o2: Employee?): Int {
        if(o1 == null || o2 == null)
            return 0
        return o1.salary.compareTo(o2.salary)
    }
}
// A comparator to compare salary of employee
class FirstnameComparator: Comparator<Employee>{
    override fun compare(o1: Employee?, o2: Employee?): Int {
        if(o1 == null || o2 == null)
            return 0
        return o1.firstName.compareTo(o2.firstName)
    }
}
