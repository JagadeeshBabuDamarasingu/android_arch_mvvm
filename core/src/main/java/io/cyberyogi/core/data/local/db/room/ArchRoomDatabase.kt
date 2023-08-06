package io.cyberyogi.core.data.local.db.room

import androidx.room.Database
import androidx.room.RoomDatabase
import io.cyberyogi.core.data.local.db.room.dao.PersonDao
import io.cyberyogi.core.domain.Person

@Database(entities = [Person::class], version = 1, exportSchema = true)
abstract class ArchRoomDatabase : RoomDatabase() {
    abstract val personDao: PersonDao
}