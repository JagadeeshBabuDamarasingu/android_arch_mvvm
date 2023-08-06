package io.cyberyogi.core.viewModel.rx

import io.reactivex.rxjava3.disposables.Disposable

interface RxViewModel {

    fun Disposable.addToDisposable()
    fun onCleared()
}