import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import kotlinx.coroutines.delay

class StringSpecStyle : StringSpec({
    beforeTest { println("call before test") }

    "테스트 1" {
        println("start test 1")
        1 shouldBe 1
    }

    "테스트 2".config(enabled = false) {
        println("start test 2")
        1 shouldBe 1
    }

    "테스트 3".config(invocations = 3, threads = 3) {
        delay(2000)
        println("start test 3")
        1 shouldBe 1
    }

    listOf("a", "b", "c")
        .forEach {
            "test $it" {
                println("start test $it")
                1 shouldBe 1
            }
        }
})
