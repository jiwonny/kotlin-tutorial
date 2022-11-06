import io.kotest.assertions.throwables.shouldThrowExactly
import io.kotest.core.spec.style.FreeSpec

class LottoNumbersTest : FreeSpec({
    "중복된 숫자가 포함될 경우 예외를 던져야 한다" {
        val numbers = listOf(1, 2, 3, 4, 4, 5)

        shouldThrowExactly<IllegalStateException> {
            LottoNumbers(numbers)
        }
    }

    "숫자가 6개가 아닌 경우 예외를 던져야 한다" {
        val numbers = listOf(1, 2)

        shouldThrowExactly<IllegalStateException> {
            LottoNumbers(numbers)
        }
    }
})
