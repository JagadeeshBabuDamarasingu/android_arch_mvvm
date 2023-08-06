package io.cyberyogi.core.di.modules

import android.content.Context
import android.content.SharedPreferences
import dagger.Module
import dagger.Provides
import io.cyberyogi.core.data.local.prefs.PrefHelper
import io.cyberyogi.core.data.local.prefs.PrefManager

@Module
open class PreferenceModule(private val context: Context, private val prefName: String) {

    @Provides
    open fun providesPreferences(): SharedPreferences {
        return context.getSharedPreferences(prefName, Context.MODE_PRIVATE)
    }

    @Provides
    open fun providesPreferenceHelper(prefHelper: PrefHelper): PrefManager = prefHelper
}