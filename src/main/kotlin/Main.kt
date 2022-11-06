fun main() {
    val lottoGame = LottoGame(inputStream = CliInputStream())

    lottoGame.enterPurchaseAmount()
    lottoGame.enterManualLotteryPaperCount()
}
