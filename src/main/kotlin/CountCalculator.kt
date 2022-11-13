class CountCalculator(
    private val price: MoneyAmount
) {
    fun getCount(purchaseAmount: MoneyAmount): Int {
        return purchaseAmount / price
    }
}
