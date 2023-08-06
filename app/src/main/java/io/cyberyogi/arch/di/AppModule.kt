package io.cyberyogi.arch.di

import android.app.Application
import android.content.Context
import dagger.Binds
import dagger.Module
import io.cyberyogi.arch.ArchApplication

@Module
abstract class AppModule {

    @Binds
    abstract fun provideApplication(application: ArchApplication): Application

    @Binds
    abstract fun providesContext(application: ArchApplication): Context
}