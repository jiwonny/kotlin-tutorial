import io.kotest.core.spec.style.FreeSpec
import util.IllegalStateException
import util.catch
import util.shouldThrow

class LottoNumberTest : FreeSpec({
    "1보다 작은 숫자인 경우 예외를 반환해야 한다" {
        val number = 0

        val exception = catch { LottoNumber(number) }

        exception shouldThrow IllegalStateException
    }

    "45보다 큰 숫자인 경우 예외를 반환해야 한다" {
        val number = 46

        val exception = catch { LottoNumber(number) }

        exception shouldThrow IllegalStateException
    }
})
