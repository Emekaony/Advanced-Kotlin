package nullability

private fun simpleNullability() {
    // use checkNotNull to make sure somn ain't null
    val name: String? = null
    val age: Int? = 33

    checkNotNull(name) { "Cannot have a null name" }

    /*elvis operator
    A ?: null == A
    null ?: "B" == B
     */
}