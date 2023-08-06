package io.cyberyogi.core.data

import io.reactivex.rxjava3.core.Observable


interface DataManager {
    fun fetchData(): Observable<List<String>>
}