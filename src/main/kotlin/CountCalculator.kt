class CountCalculator(
    private val price: PurchaseAmount
) {
    fun getCount(purchaseAmount: PurchaseAmount): Int {
        return purchaseAmount.amount / price.amount
    }
}
