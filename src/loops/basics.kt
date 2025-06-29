package loops

private fun simpleRangeLoop() {
    val start = 0
    val end = 10

    // this range is inclusive
    // u can make it exclusive by doing ..<
    for (i: Int in start..end) {
        println(i)
    }

    // another way to make it exclusive is by using until
    for (i in 0 until 10) {
        println(i)
    }

    // to iterate in reverse, use downTo
    for (i in 10 downTo 3) {
        println(i)
    }
}

private fun simpleMapIteration() {
    val capitals: Map<String, String> = mapOf(
        "Abia" to "Umuahia",
        "Adamawa" to "Yola",
        "Bauchi" to "Bauchi"
    )

    // easy way to iterate maps
    // remember that every single thing in kotlin is an Object
    capitals.forEach { (state, capital) ->
        println("$state -> $capital")
    }
}
fun main(): Unit {
//    simpleRangeLoop()
    simpleMapIteration()
}