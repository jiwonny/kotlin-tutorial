class LottoNumbers(
    numbers: List<Int>
) {
    private val lotteryNumbers: MutableList<LottoNumber> = mutableListOf()

    companion object {
        val price = PurchaseAmount(1000)
        const val VALID_SIZE = 6
    }

    init {
        lotteryNumbers.addAll(numbers.map(::LottoNumber))
        validate(lotteryNumbers)
    }

    private fun validate(numbers: List<LottoNumber>) {
        check(hasValidSize(numbers)) { "6개의 숫자가 필요해요." }
        check(hasDuplicate(numbers)) { "중복된 숫자가 포함될 수 없어요." }
    }

    private fun hasValidSize(numbers: List<LottoNumber>) = numbers.size == VALID_SIZE

    private fun hasDuplicate(numbers: List<LottoNumber>): Boolean {
        val distinct = numbers.distinctBy { it.number }
        return distinct.size == numbers.size
    }
}
