import kotlinx.serialization.Serializable

@Serializable
data class Item(val desc: String) {
    companion object {
        const val PATH = "/items"
    }
}