package generics

interface Retailer<out T> {
    fun sell(): T
}

class DogRetailer : Retailer<Dog> {
    override fun sell(): Dog {
        println("Sell Gog")
        return Dog("")
    }
}

class CatRetailer : Retailer<Cat> {
    override fun sell(): Cat {
        println("Sell Cat")
        return Cat("")
    }
}

class FishRetailer : Retailer<Fish> {
    override fun sell(): Fish {
        println("Sell Fish")
        return Fish("")

    }
}

fun main() {
    val catRetailer1 = CatRetailer()
    val catRetailer2: CatRetailer = CatRetailer()

    val dogRetailer: Retailer<Dog> = DogRetailer()
    val catRetailer: Retailer<Cat> = CatRetailer()

    val petRetailer:Retailer<Pet> = CatRetailer()
}
