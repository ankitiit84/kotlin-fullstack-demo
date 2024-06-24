import io.ktor.client.*
import io.ktor.client.call.*
import io.ktor.client.plugins.contentnegotiation.*
import io.ktor.client.request.*
import io.ktor.http.*
import io.ktor.serialization.kotlinx.json.*

val jsonClient = HttpClient {
    install(ContentNegotiation) {
        json()
    }
}

suspend fun getItems(): List<Item> {
    return jsonClient.get(Item.PATH).body()
}

suspend fun addItem(item: Item) {
    jsonClient.post(Item.PATH) {
        contentType(ContentType.Application.Json)
        setBody(item)
  }
}
