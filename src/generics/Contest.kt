package generics

class Contest<T : Pet>(var vet: Vet<T>) {
    private val scores: MutableMap<T, Int> = mutableMapOf()

    fun addScore(t: T, score: Int = 0) {
        if (score > 0) scores.put(t, score)
    }

    fun getWinner(): MutableSet<T> {
        val higherScore = scores.values.max()
        val winners: MutableSet<T> = mutableSetOf()
        for ((t, score) in scores) {
            if (score == higherScore) winners.add(t)
        }
        return winners
    }
}