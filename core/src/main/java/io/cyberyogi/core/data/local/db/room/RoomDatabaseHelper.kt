package io.cyberyogi.core.data.local.db.room

import io.cyberyogi.core.data.local.db.DataBaseManager
import io.cyberyogi.core.domain.Person
import io.reactivex.rxjava3.core.Completable
import io.reactivex.rxjava3.core.Observable
import javax.inject.Inject

class RoomDatabaseHelper @Inject constructor(
    private val db: ArchRoomDatabase
) : DataBaseManager {

    override fun insertPerson(person: Person) = Completable.fromCallable {
        db.personDao.insert(person)
    }

    override fun getPersonObservable(): Observable<List<Person>> {
        return db.personDao.getPersons()
    }
}