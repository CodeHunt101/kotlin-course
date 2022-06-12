fun main() {
    val names = listOf("Alice", "Bob", "Carol", "Dan")
//    val myLambda = {name:String -> println("Hello there $name")}
//    sayHello(names, myLambda)
    sayHello(names)
    { name: String -> println("Hello there $name") }
}

fun sayHello(names: List<String>, doSomething: (String) -> Unit) {
    for (name in names) {
        doSomething(name)
    }
}