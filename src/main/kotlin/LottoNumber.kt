class LottoNumber(
    val number: Int
) {
    companion object {
        const val LOWEST_NUMBER = 1
        const val HIGHEST_NUMBER = 45
    }

    init {
        validate(number)
    }

    private fun validate(number: Int) {
        check(number in LOWEST_NUMBER..HIGHEST_NUMBER) { "$LOWEST_NUMBER 와 $HIGHEST_NUMBER 사이의 숫자여야 해요" }
    }
}
