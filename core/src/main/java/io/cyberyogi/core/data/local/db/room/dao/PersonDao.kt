package io.cyberyogi.core.data.local.db.room.dao

import androidx.room.Dao
import androidx.room.Query
import io.cyberyogi.core.domain.Person
import io.reactivex.rxjava3.core.Observable

@Dao
abstract class PersonDao : BaseDao<Person>() {

    @Query("SELECT * FROM person")
    abstract fun getPersons(): Observable<List<Person>>
}