package io.cyberyogi.arch.di

import dagger.BindsInstance
import dagger.Component
import io.cyberyogi.arch.ArchApplication
import io.cyberyogi.arch.view.home.MainActivity
import io.cyberyogi.core.data.DataManager
import io.cyberyogi.core.data.DataRepository
import io.cyberyogi.core.di.CoreComponent
import io.cyberyogi.core.di.modules.DatabaseModule
import io.cyberyogi.core.di.modules.NetworkModule
import io.cyberyogi.core.di.modules.PreferenceModule
import io.cyberyogi.core.di.modules.RepositoryModule
import io.cyberyogi.core.di.modules.RoomDatabaseModule

@Component(
    modules = [
        AppModule::class,
        RepositoryModule::class,
        NetworkModule::class,
        PreferenceModule::class,
        DatabaseModule::class
    ],
    dependencies = [CoreComponent::class]
)
interface AppComponent {

    fun dataRepository(): DataManager

    fun inject(activity: MainActivity)

    @Component.Factory
    interface Factory {
        fun create(
            @BindsInstance application: ArchApplication,
            coreComponent: CoreComponent,
            preferenceModule: PreferenceModule,
            databaseModule: DatabaseModule,
            networkModule: NetworkModule
        ): AppComponent
    }

}