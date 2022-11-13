import io.kotest.core.spec.style.FreeSpec
import util.IllegalStateException
import util.catch
import util.shouldThrow

class LottoNumbersTest : FreeSpec({
    "중복된 숫자가 포함될 경우 예외를 던져야 한다" {
        val numbers = listOf(1, 2, 3, 4, 4, 5)

        val exception = catch { LottoNumbers(numbers) }

        exception shouldThrow IllegalStateException
    }

    "숫자가 6개가 아닌 경우 예외를 던져야 한다" {
        val numbers = listOf(1, 2)

        val exception = catch { LottoNumbers(numbers) }

        exception shouldThrow IllegalStateException
    }
})
