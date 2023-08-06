package io.cyberyogi.core.data.local.db

import io.cyberyogi.core.domain.Person
import io.reactivex.rxjava3.core.Completable
import io.reactivex.rxjava3.core.Observable

interface DataBaseManager {
    fun insertPerson(person: Person) : Completable
    fun getPersonObservable(): Observable<List<Person>>
}