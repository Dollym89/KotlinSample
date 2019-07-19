package generics

class PetOwner<T : Pet>(t: T) {
    private val pets: MutableList<T> = mutableListOf(t)

    fun add(t: T) {
        pets.add(t)
    }

    fun remove(t: T) {
        pets.remove(t)
    }
}