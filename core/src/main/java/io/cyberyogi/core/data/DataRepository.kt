package io.cyberyogi.core.data

import io.cyberyogi.core.data.local.db.DataBaseManager
import io.cyberyogi.core.data.local.prefs.PrefManager
import io.reactivex.rxjava3.core.Observable
import javax.inject.Inject

class DataRepository @Inject constructor(
    private val prefManager: PrefManager,
    private val dataManager: DataBaseManager
) : DataManager {

    override fun fetchData(): Observable<List<String>> {
        return Observable.just(listOf("Jagadeesh", "Babu", "Damarasingu"))
    }
}

