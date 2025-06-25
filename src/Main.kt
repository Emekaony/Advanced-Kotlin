fun main() {
    val person: Person = Student(22, firstName = "Nnaemeka", lastName = "Onyeokoro")
    person.printName()

    val provider: StringProvider = DefaultStringProvider()
    println(provider.getID(22))

    val direction = Direction.SOUTH
    println(direction.ordinal)
    println(getMessageFromDirection(direction))

    val task1 = Task("Build search feature")
    val task2 = Task("Add analytics")


}

fun getMessageFromDirection(direction: Direction): String {
    return when (direction) {
        // u do not need a return statement inside "when" clause
        Direction.EAST -> "Going east bound"
        Direction.WEST -> "Going west bound"
        Direction.NORTH -> "Going North bound"
        Direction.SOUTH -> "Going South bound"
    }
}