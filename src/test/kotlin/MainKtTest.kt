import io.kotest.core.spec.style.BehaviorSpec

class MainKtTest : BehaviorSpec({
    given("이게 given") {
        `when`("when") {
            then("then") {

                println("hi")
            }
        }
    }
})
