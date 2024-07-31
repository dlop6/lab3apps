open class Food  (var name: String, var price: Double) {

    open fun cook(): String{
        return "Cada alimento tiene su forma de cocinarlo"
    }

    open fun discountedPrice(discount: Double): Double {
        return price - price*discount
    }
}

class Burger(name: String, price: Double) : Food(name, price){
    override fun cook(): String {
        return "Para cocinar una hamburguesa, se necesita pan de hamburguesa, torta de carne," +
                "queso, vegetales y aderezos al gusto."
    }
}

class Pizza(name: String, price: Double) : Food(name, price){
    override fun cook(): String {
        return "Para cocinar una pizza hay que tener masa, embutidos y queso."
    }
}

class Drink(name: String, price: Double) : Food(name, price){
    override fun cook(): String {
        return "Para cocinar una pizza hay que tener masa, embutidos y queso."
    }

    fun pour(): String{
        return "Se tiene que veritr con picheles."
    }
}


interface Dessert{
    fun eat():String
}

class IceCream(name: String, price: Double) : Food(name, price), Dessert{
    override fun cook(): String {
        return "Para enfriar el helado hay que dejarlo 2 horas en el refrigerador."
    }
    override fun eat():String{
        return "Para comer el helado necesitas comprar conos."
    }
}