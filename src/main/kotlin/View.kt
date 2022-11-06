fun interface InputStream {
    fun readInt(): Int
}

class View(
    private val inputStream: InputStream
) {
    fun getPrice(): Int {
        println("구입금액을 입력해 주세요.")
        return inputStream.readInt()
    }

    fun getManualLotteryPaperCount(): Int {
        println("수동으로 구매할 로또 수를 입력해 주세요.")
        val value = inputStream.readInt()
        return value
    }
}
