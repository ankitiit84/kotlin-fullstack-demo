import react.*
import kotlinx.coroutines.*
import react.dom.html.ReactHTML.h1
import react.dom.html.ReactHTML.li
import react.dom.html.ReactHTML.ul

private val scope = MainScope()

val App = FC<Props> {
    var items by useState(emptyList<Item>())

    useEffectOnce {
        scope.launch {
            items = getItems()
        }
    }

    h1 {
        +"Kotlin Full-Stack Demo"
    }
    ul {
        items.sortedByDescending(Item::desc).forEach { item ->
            li {
                key = item.toString()
                +"${item.desc} "
            }
        }
    }
    InputComponent {
        onSubmit = { input ->
            val cartItem = Item(input.replace("!", ""))
            scope.launch {
                addItem(cartItem)
                items = getItems()
            }
        }
    }
}