import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.should
import io.kotest.matchers.shouldBe
import io.kotest.matchers.types.beInstanceOf

class FuncSpecStyle : FunSpec({
    val fixture = 1

    beforeTest { println("run before each test") }

    test("this is test") {
        println("start test")
        fixture shouldBe 1
    }

    listOf("a", "b", "c")
        .forEach {
            test(it) {
                println("start test $it")
                it should beInstanceOf<String>()
            }
        }
})
