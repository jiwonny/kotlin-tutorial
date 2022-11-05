import io.kotest.assertions.throwables.shouldThrow
import io.kotest.core.spec.style.FreeSpec
import io.kotest.matchers.shouldBe

class ViewTest : FreeSpec() {

    init {
        "구입 금액이 문자열인 경우 예외가 발생해야 한다." {
            val testInputStreamImpl = InputStream { "문자열" }
            val view = View(testInputStreamImpl)

            shouldThrow<IllegalArgumentException> {
                view.enterPurchaseAmount()
            }
        }

        "구입 금액이 null인 경우 예외가 발생해야 한다." {
            val testInputStreamImpl = InputStream { null }
            val view = View(testInputStreamImpl)

            shouldThrow<IllegalArgumentException> {
                view.enterPurchaseAmount()
            }
        }

        "정수를 입력한 경우 정수값에 해당하는 구입 금액을 반환해야 한다" {
            val testInputStream = InputStream { "1000" }
            val view = View(testInputStream)

            val result = view.enterPurchaseAmount()

            result.amount shouldBe 1000
        }
    }
}
