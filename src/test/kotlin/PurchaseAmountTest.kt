import io.kotest.core.spec.style.FreeSpec
import io.kotest.matchers.shouldBe
import util.IllegalArgumentException
import util.catch
import util.shouldThrow

class PurchaseAmountTest : FreeSpec({
    "0원 이하의 금액인 경우 예외가 발생한다" {
        val amount = 0

        val exception = catch { MoneyAmount(amount) }

        exception shouldThrow IllegalArgumentException
    }

    "0원 초과 금액인 경우 PurchaseAmount를 생성할 수 있다" {
        val amount = 1000

        val result = MoneyAmount(amount)

        result.amount shouldBe amount
    }
})
