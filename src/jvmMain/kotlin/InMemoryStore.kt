class InMemoryStore {
    private val shoppingList = listOf(Item("Tomato"), Item("Cupcake"), Item("Donut")).toMutableList()
    fun getAll(): List<Item> {
        return shoppingList
    }

    fun add(item: Item) {
        shoppingList.add(item)
    }
}