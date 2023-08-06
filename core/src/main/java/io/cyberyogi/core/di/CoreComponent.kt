package io.cyberyogi.core.di

import android.app.Activity
import dagger.Component
import io.cyberyogi.core.data.DataRepository
import io.cyberyogi.core.di.modules.CoreModule
import io.cyberyogi.core.di.modules.DatabaseModule
import io.cyberyogi.core.di.modules.NetworkModule
import io.cyberyogi.core.di.modules.PreferenceModule

@Component(modules = [CoreModule::class])
interface CoreComponent

fun Activity.coreComponent(): CoreComponent = DaggerCoreComponent.create()

fun coreComponent(): CoreComponent = DaggerCoreComponent.create()