package io.cyberyogi.core.di.modules

import dagger.Module
import dagger.Provides
import io.cyberyogi.core.data.DataManager
import io.cyberyogi.core.data.DataRepository

@Module
class CoreModule {


    @Provides
    fun providesDataRepository(repository: DataRepository): DataManager = repository
}