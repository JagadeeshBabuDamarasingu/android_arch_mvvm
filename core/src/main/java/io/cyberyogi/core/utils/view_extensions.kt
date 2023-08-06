package io.cyberyogi.core.utils

import android.view.View

fun View.gone() {
    visibility = View.GONE
}

fun View.visible() {
    visibility = View.VISIBLE
}

fun View.invisible() {
    visibility = View.INVISIBLE
}

fun View.goneIf(shouldGone: Boolean) {
    visibility = if (shouldGone) View.GONE else View.VISIBLE
}

fun View.invisibleIf(shouldInvisible: Boolean) {
    visibility = if (shouldInvisible) View.INVISIBLE else View.VISIBLE
}
