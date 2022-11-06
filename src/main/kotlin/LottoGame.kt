import kotlin.properties.Delegates

class LottoGame(
    inputStream: InputStream
) {
    private val view = View(inputStream)
    private val countCalculator = CountCalculator(LottoNumbers.price)

    private lateinit var purchaseAmount: PurchaseAmount
    private var lotteryPaperCount by Delegates.notNull<Int>()
    private var manualLotteryPaperCount by Delegates.notNull<Int>()

    fun enterPurchaseAmount() {
        purchaseAmount = PurchaseAmount(view.getPrice())
        lotteryPaperCount = countCalculator.getCount(purchaseAmount)
    }

    fun enterManualLotteryPaperCount() {
        val count = view.getManualLotteryPaperCount()
        require(count <= lotteryPaperCount) { "총 구매 수를 넘을 수 없어요" }
        manualLotteryPaperCount = count
    }
}
