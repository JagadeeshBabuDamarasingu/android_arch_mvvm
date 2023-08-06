package io.cyberyogi.core.utils

import android.app.Activity
import android.content.Intent
import android.os.Build
import android.view.View
import android.view.Window
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
import androidx.core.os.BuildCompat
import androidx.fragment.app.Fragment
import timber.log.Timber

fun AppCompatActivity.hideStatusBar(hideTooBar: Boolean = true) {
    requestWindowFeature(Window.FEATURE_NO_TITLE)
    window.decorView.systemUiVisibility =
        window.decorView.systemUiVisibility or View.SYSTEM_UI_FLAG_FULLSCREEN
    window.setFlags(
        WindowManager.LayoutParams.FLAG_FULLSCREEN,
        WindowManager.LayoutParams.FLAG_FULLSCREEN
    )
    window.addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)

    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.P) {
        window.attributes.layoutInDisplayCutoutMode =
            WindowManager.LayoutParams.LAYOUT_IN_DISPLAY_CUTOUT_MODE_SHORT_EDGES
    }
    if (hideTooBar) supportActionBar?.hide()
}


/**
 *  hides the Soft Navigation bar
 *  navigation bar can be brought back by swiping up from bottom
 */
fun Activity.hideNavigationBar() {
    window.decorView.systemUiVisibility = window.decorView.systemUiVisibility or
            if (Build.VERSION.SDK_INT in 11..19) {
                View.GONE
            } else {
                View.SYSTEM_UI_FLAG_HIDE_NAVIGATION or View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY
            }
}

fun Activity.intentTo(desClassName: Class<*>?) = Intent(this, desClassName)
fun Fragment.intentTo(desClassName: Class<*>?) = Intent(activity, desClassName)

fun Any?.print(message: String) = Timber.i("$message $this")
fun Throwable?.print(message: String) = Timber.e(this, message)
