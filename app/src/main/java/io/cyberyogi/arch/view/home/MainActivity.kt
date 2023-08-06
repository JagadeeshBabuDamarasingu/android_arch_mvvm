package io.cyberyogi.arch.view.home

import android.os.Bundle
import androidx.activity.viewModels
import androidx.fragment.app.FragmentActivity
import io.cyberyogi.arch.appComponent
import io.cyberyogi.arch.databinding.ActivityMainBinding
import io.cyberyogi.core.data.DataManager
import io.cyberyogi.core.state.Data
import javax.inject.Inject

class MainActivity : FragmentActivity() {

    @Inject
    lateinit var dataManager: DataManager

    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    private val viewModel by viewModels<HomeViewModel> { HomeViewModel.Factory }

    override fun onCreate(savedInstanceState: Bundle?) {
        appComponent().inject(this)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        viewModel.namesLiveData.observe(this) {
            when (it) {
                is Data.Loading -> println("names list: loading")
                is Data.Error -> println("names list: error is ${it.message}")
                is Data.Success -> println("names list is ${it.value}")
            }
        }

//        viewModel.loadData()

    }
}