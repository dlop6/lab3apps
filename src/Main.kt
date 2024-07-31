fun main() {
    // Crear instancias de diferentes alimentos
    val burger = Burger("Hamburguesa Clásica", 5.0)
    val pizza = Pizza("Pizza Margarita", 8.0)
    val drink = Drink("Jugo de Naranja", 2.5)
    val iceCream = IceCream("Helado de Vainilla", 3.0)

    // Llamar a la función cook() para cada artículo e imprimir los mensajes devueltos
    println(burger.cook())
    println(pizza.cook())
    println(drink.cook())
    println(iceCream.cook())

    // Crear una instancia de IceCream y llamar a la función eat(), imprimir el mensaje devuelto
    println(iceCream.eat())

    // Crear una instancia de Burger y usar la función discountedPrice() para calcular e imprimir el precio con descuento
    val discount = 0.10 // 10% de descuento
    val discountedBurgerPrice = burger.discountedPrice(discount)
    println("El precio con descuento de la hamburguesa es: $$discountedBurgerPrice")
}
