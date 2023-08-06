package io.cyberyogi.arch

import android.app.Activity
import android.app.Application
import io.cyberyogi.arch.di.AppComponent
import io.cyberyogi.arch.di.DaggerAppComponent
import timber.log.Timber
import io.cyberyogi.core.di.coreComponent
import io.cyberyogi.core.di.modules.DatabaseModule
import io.cyberyogi.core.di.modules.NetworkModule
import io.cyberyogi.core.di.modules.PreferenceModule


class ArchApplication : Application() {

    val coreComponent by lazy { coreComponent() }
    val appComponent by lazy {
        DaggerAppComponent.factory()
            .create(
                this, coreComponent,
                PreferenceModule(this, "shared_prefs"),
                DatabaseModule("db_name"),
                NetworkModule()
            )
    }

    override fun onCreate() {
        super.onCreate()

        initTimber()
    }

    private fun initTimber() {

        Timber.plant(
            Timber.DebugTree()
        )
    }
}

fun Activity.appComponent(): AppComponent {
    return (application as ArchApplication).appComponent
}