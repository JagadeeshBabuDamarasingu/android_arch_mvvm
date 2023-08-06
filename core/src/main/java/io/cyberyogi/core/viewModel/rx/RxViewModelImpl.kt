package io.cyberyogi.core.viewModel.rx

import io.reactivex.rxjava3.disposables.CompositeDisposable
import io.reactivex.rxjava3.disposables.Disposable

object RxViewModelImpl : RxViewModel {
    private val compositeDisposable = CompositeDisposable()

    override fun Disposable.addToDisposable() {
        compositeDisposable.add(this)
    }

    override fun onCleared() {
        compositeDisposable.clear()
    }
}