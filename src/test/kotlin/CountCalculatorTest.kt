import io.kotest.core.spec.style.FreeSpec
import io.kotest.matchers.shouldBe

class CountCalculatorTest : FreeSpec({
    "금액을 입력했을 때 구매할 수 있는 최대 장수를 반환해야 한다" {
        val calculator = CountCalculator(MoneyAmount(1000))
        val purchaseAmount = MoneyAmount(13500)

        val result = calculator.getCount(purchaseAmount)

        result shouldBe 13
    }

    "한장 가격이 주어진 금액보다 비쌀 때 0장을 반환해야 한다" {
        val calculator = CountCalculator(MoneyAmount(1000))
        val purchaseAmount = MoneyAmount(900)

        val result = calculator.getCount(purchaseAmount)

        result shouldBe 0
    }
})
