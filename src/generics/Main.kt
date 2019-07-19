package generics

fun main() {
    val catFuzz = Cat("Fuzz Light")
    val catKatsu = Cat("Katsu")
    val fishFinny = Fish("Finny")
    val catOwner = PetOwner<Cat>(catFuzz)
    catOwner.add(catKatsu)

    val catRetailer1 = CatRetailer()
    val catRetailer2: CatRetailer = CatRetailer()

    val dogRetailer: Retailer<Dog> = DogRetailer()
    val catRetailer: Retailer<Cat> = CatRetailer()

    val petRetailer:Retailer<Pet> = CatRetailer()
}