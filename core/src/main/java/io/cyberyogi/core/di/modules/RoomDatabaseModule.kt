package io.cyberyogi.core.di.modules

import android.content.Context
import androidx.room.Room
import dagger.Module
import dagger.Provides
import io.cyberyogi.core.data.local.db.room.ArchRoomDatabase
import io.cyberyogi.core.di.qualifiers.DatabaseName

@Module
class RoomDatabaseModule {

    @Provides
    fun providesRoomDataBase(context: Context, @DatabaseName dbName: String): ArchRoomDatabase {
        return Room.databaseBuilder(
            context.applicationContext, ArchRoomDatabase::class.java, dbName
        ).build()
    }
}