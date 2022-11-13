data class MoneyAmount(
    val amount: Int
) {
    init {
        require(amount > 0) { "구입 금액은 0보다 커야해요" }
    }

    operator fun div(other: MoneyAmount): Int {
        return amount / other.amount
    }
}
