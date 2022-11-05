import io.kotest.assertions.throwables.shouldThrowExactly
import io.kotest.core.spec.style.FreeSpec
import io.kotest.matchers.shouldBe

class PurchaseAmountTest : FreeSpec({
    "0원 이하의 금액인 경우 예외가 발생한다" {
        val amount = 0

        shouldThrowExactly<IllegalArgumentException> {
            PurchaseAmount(amount)
        }
    }

    "0원 초과 금액인 경우 PurchaseAmount를 생성할 수 있다" {
        val amount = 1000

        val result = PurchaseAmount(amount)

        result.amount shouldBe amount
    }
})
