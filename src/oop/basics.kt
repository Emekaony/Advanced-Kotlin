package oop

class User {
    private val name: String = "Emeka"
        // this is how u define getters for class members
        // pls do not go around defining custom getter and setter function
        // make sure to use "field" and not property name to avoid infinite recursion
        get() = field.uppercase()
}

fun main() {

}