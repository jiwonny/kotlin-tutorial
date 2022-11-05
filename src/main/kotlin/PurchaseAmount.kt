data class PurchaseAmount(
    val amount: Int
) {
    init {
        require(amount > 0) { "구입 금액은 0보다 커야해요" }
    }
}
