package util

import io.kotest.assertions.throwables.shouldThrowExactly
import kotlin.IllegalArgumentException
import kotlin.IllegalStateException

abstract class ExceptionClass<T : Throwable>

object IllegalStateException : ExceptionClass<IllegalStateException>()
object IllegalArgumentException : ExceptionClass<IllegalArgumentException>()

fun catch(fn: () -> Any): Result<Any> {
    return runCatching {
        fn()
    }
}

inline infix fun <reified T : Throwable> Result<Any>.shouldThrow(ec: ExceptionClass<T>) {
    shouldThrowExactly<T> {
        this.getOrThrow()
    }
}
