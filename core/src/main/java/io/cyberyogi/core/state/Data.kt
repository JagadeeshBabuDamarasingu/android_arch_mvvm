package io.cyberyogi.core.state

sealed class Data<out T : Any> {
    object Loading : Data<Nothing>()
    data class Success<out T : Any>(val value: T) : Data<T>()
    data class Error(val message: String, val cause: Throwable? = null) : Data<Nothing>()
}