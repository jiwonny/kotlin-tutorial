import io.kotest.assertions.throwables.shouldThrowExactly
import io.kotest.core.spec.style.FreeSpec
import io.kotest.matchers.shouldBe

class ViewTest : FreeSpec() {

    init {
        "구입 금액 입력" - {
            "정수를 입력한 경우 정수값에 해당하는 구입 금액을 반환해야 한다" {
                val testInputStream = InputStream { 1000 }
                val view = View(testInputStream)

                val result = view.enterPurchaseAmount()

                result.amount shouldBe 1000
            }
        }

        "수동 구매 로또 수 입력" - {
            "수동 구매 로또 수가 전체 구매 로또 수 초과인 경우 예외가 발생해야 한다" {
                val testInputStream = InputStream { 10 }
                val view = View(testInputStream)

                shouldThrowExactly<IllegalArgumentException> {
                    view.enterManualLotteryPaperNum(8)
                }
            }

            "수동 구매 로또 수가 전체 구매 로또 수 이하여야 한다" {
                val testInputStream = InputStream { 10 }
                val view = View(testInputStream)

                val result = view.enterManualLotteryPaperNum(14)

                result shouldBe 10
            }
        }
    }
}
