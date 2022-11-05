fun interface InputStream {
    fun readInt(): Int
}

class View(
    private val inputStream: InputStream
) {
    fun enterPurchaseAmount(): PurchaseAmount {
        println("구입금액을 입력해 주세요.")
        return PurchaseAmount(inputStream.readInt())
    }

    fun enterManualLotteryPaperNum(totalNum: Int): Int {
        println("수동으로 구매할 로또 수를 입력해 주세요.")
        val value = inputStream.readInt()
        require(value <= totalNum) { "총 구매 수를 넘을 수 없어요" }
        return value
    }
}
