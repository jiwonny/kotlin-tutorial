import kotlin.runCatching as runCatching

fun interface InputStream {
    fun readLine(): String?
}

class View(
    private val inputStream: InputStream
) {
    private fun readInt(): Int {
        val value = inputStream.readLine()
        requireNotNull(value) { "null이 될 수 없습니다" }
        return runCatching {
            value.toInt()
        }.getOrElse { throw IllegalArgumentException("값이 정수여야 합니다") }
    }

    fun enterPurchaseAmount(): PurchaseAmount {
        println("구입금액을 입력해 주세요.")
        return PurchaseAmount(readInt())
    }
}

data class PurchaseAmount(
    val amount: Int
) {
    init {
        if (amount <= 0) {
            throw IllegalArgumentException()
        }
    }
}
