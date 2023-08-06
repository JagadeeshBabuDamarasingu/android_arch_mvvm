package io.cyberyogi.arch.view.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory.Companion.APPLICATION_KEY
import androidx.lifecycle.createSavedStateHandle
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import io.cyberyogi.arch.ArchApplication
import io.cyberyogi.core.data.DataManager
import io.cyberyogi.core.data.DataRepository
import io.cyberyogi.core.di.coreComponent
import io.cyberyogi.core.state.Data
import io.cyberyogi.core.viewModel.rx.RxViewModel
import io.cyberyogi.core.viewModel.rx.RxViewModelImpl
import io.cyberyogi.core.viewModel.rx.RxViewModelImpl.addToDisposable
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.core.Observable
import io.reactivex.rxjava3.disposables.CompositeDisposable
import io.reactivex.rxjava3.schedulers.Schedulers
import kotlinx.coroutines.flow.MutableStateFlow

class HomeViewModel constructor(
    private val repository: DataManager,
    private val savedStateHandle: SavedStateHandle
) : ViewModel() {

    companion object {

        val Factory: ViewModelProvider.Factory = viewModelFactory {
            initializer {
                val savedStateHandle = createSavedStateHandle()
                val application = this[APPLICATION_KEY] as ArchApplication
                HomeViewModel(application.appComponent.dataRepository(), savedStateHandle)
            }
        }
    }

    val stateFlow = MutableStateFlow("")

    private val compositeDisposable = CompositeDisposable()

    fun getNameLiveData(): LiveData<Data<String>> = namesLiveData

    val namesLiveData = MutableLiveData<Data<String>>(Data.Loading)

    fun loadData() {
//        compositeDisposable.add(repository.fetchData()
//            .subscribeOn(Schedulers.io())
//            .observeOn(AndroidSchedulers.mainThread())
//            .flatMap { Observable.fromIterable(it) }
//            .subscribe()
//            .subscribe({ namesLiveData.value = Data.Success(it) }, { err ->
//                err.printStackTrace()
//                namesLiveData.value = Data.Error("failed to fetch data!", cause = err)
//            })
//        )
    }

    override fun onCleared() {
        compositeDisposable.dispose()
        super.onCleared()
    }
}