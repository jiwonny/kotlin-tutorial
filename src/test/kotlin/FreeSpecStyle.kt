import io.kotest.core.spec.style.FreeSpec
import io.kotest.matchers.shouldBe

class FreeSpecStyle : FreeSpec({
    "Free spec test" - {
        1 shouldBe 1
    }
})