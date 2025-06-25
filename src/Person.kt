// an open class is a class that allows inheritance!
open class Person(
    age: Int,
    val firstName: String,
    val lastName: String
) {

    init {
        // do ur validation here
        check(age >= 0) {
            "A persons age cannot be negative"
        }

        check(!firstName.isEmpty()) {
            "A persons first name cannot be empty"
        }

        check(!lastName.isEmpty()) {
            "A persons last name cannot be empty"
        }
    }

    // there's a shorthand method for doing this up there
    // where u just name it var age: Int -> this essentially turns it into a class member
    val age: Int = age


    open fun printName() {
        println("$firstName $lastName")
    }
}