package com.bendb.assertk

inline fun assertThat(block: AssertScope.() -> Unit) {
    AssertScope.block()
}

inline fun <T> assertAbout(value: T, block: AssertScope.(T) -> Unit) {
    AssertScope.block(value)
}

object AssertScope {
    infix fun <T> T.shouldBe(expected: T) {
        if (this != expected) {
            throw AssertionError("")
        }
    }

    infix fun <T> T.shouldNotBe(expected: T) {
        if (this == expected) {
            throw AssertionError("")
        }
    }

    infix fun <C : Collection<T>, T> C.shouldContain(expected: T) {
        if (expected !in this) {
            throw AssertionError("")
        }
    }

    infix fun <C : Collection<T>, T> C.shouldNotContain(expected: T) {
        if (expected in this) {
            throw AssertionError("")
        }
    }
}