class CliInputStream : InputStream {
    override fun readInt(): Int {
        val value = readLine()
        requireNotNull(value) { "null이 될 수 없습니다" }
        return runCatching {
            value.toInt()
        }.getOrElse { throw IllegalArgumentException("값이 정수여야 합니다") }
    }
}
