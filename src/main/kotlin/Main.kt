val view = View(inputStream = CliInputStream())

fun main() {
    val purchaseAmount = view.enterPurchaseAmount()
}
