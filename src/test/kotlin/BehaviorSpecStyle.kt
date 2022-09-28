import io.kotest.core.spec.style.BehaviorSpec
import io.kotest.matchers.shouldBe

class BehaviorSpecStyle : BehaviorSpec({
    given("given") {
        val givenFixture = 1

        `when`("when") {
            then("then") {
                givenFixture shouldBe 1
            }
        }
    }

    given("given2") {
        val anotherFixture = 2

        `when`("when") {
            then("then") {
                anotherFixture shouldBe 1
            }
        }

        `when`("when2") {
            then("then") {
                anotherFixture shouldBe 2
            }
        }
    }
})
