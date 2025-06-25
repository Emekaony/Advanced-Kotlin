class Student(
    age: Int,
    firstName: String,
    lastName: String
) : Person(age, firstName, lastName) {


    override fun printName() {
        println("This is from the student class")
        super.printName()
    }
}