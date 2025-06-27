
private interface SoundBehavior {
    fun makeSound()
}


private class Afrobeats(val artist: String) : SoundBehavior {
    override fun makeSound() = println("Hello there $artist!!!")
}

private class GenericNoiseMaker(val word: String) : SoundBehavior {
    override fun makeSound() = println("Make some noise back there pls!!!")
}

private class UseDelegate(val person: String) : SoundBehavior by GenericNoiseMaker(person)

fun main() {
    val song = Afrobeats(artist = "Wizkid")
    song.makeSound()
    val person = UseDelegate(person = "Nnaemeka")
    person.makeSound()
}