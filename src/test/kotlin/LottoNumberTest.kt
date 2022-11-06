import io.kotest.assertions.throwables.shouldThrowExactly
import io.kotest.core.spec.style.FreeSpec

class LottoNumberTest : FreeSpec({
    "1보다 작은 숫자인 경우 예외를 반환해야 한다" {
        val number = 0

        shouldThrowExactly<IllegalStateException> {
            LottoNumber(number)
        }
    }

    "45보다 큰 숫자인 경우 예외를 반환해야 한다" {
        val number = 46

        shouldThrowExactly<IllegalStateException> {
            LottoNumber(number)
        }
    }
})
