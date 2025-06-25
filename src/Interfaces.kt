
interface StringProvider {
    fun getID(id: Int): String
}

interface ResourceProvider: StringProvider {
    fun getDimension(id: Int): Long
}

class DefaultStringProvider: ResourceProvider {

    // just a simple class showing how interfaces work
    override fun getDimension(id: Int): Long {
        return 44
    }

    // now because we implement resource provider, and resource provider implements string provider
    // we must also adhere to stringProviders contracts.
    override fun getID(id: Int): String {
        return "id: $id"
    }
}