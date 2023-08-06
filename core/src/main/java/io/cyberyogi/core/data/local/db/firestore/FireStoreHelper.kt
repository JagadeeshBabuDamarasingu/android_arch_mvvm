package io.cyberyogi.core.data.local.db.firestore

import io.cyberyogi.core.data.local.db.DataBaseManager
import io.cyberyogi.core.domain.Person
import io.reactivex.rxjava3.core.Completable
import io.reactivex.rxjava3.core.Observable
import javax.inject.Inject

class FireStoreHelper @Inject constructor() : DataBaseManager {
    override fun insertPerson(person: Person): Completable {
        // no-op for now
        return Completable.complete()
    }

    override fun getPersonObservable(): Observable<List<Person>> {
        return Observable.just(emptyList())
    }

}