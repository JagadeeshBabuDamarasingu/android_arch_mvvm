package io.cyberyogi.core.di.modules

import dagger.Module
import dagger.Provides
import io.cyberyogi.core.data.local.db.DataBaseManager
import io.cyberyogi.core.data.local.db.room.RoomDatabaseHelper
import io.cyberyogi.core.di.qualifiers.DatabaseName

@Module(includes = [RoomDatabaseModule::class])
open class DatabaseModule(private val dbName: String) {

    @Provides
    fun providesDatabaseHelper(helper: RoomDatabaseHelper): DataBaseManager = helper


    @Provides
    @DatabaseName
    fun providesDatabaseName(): String = dbName
}