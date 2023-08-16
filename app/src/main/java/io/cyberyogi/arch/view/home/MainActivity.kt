package io.cyberyogi.arch.view.home

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.viewinterop.AndroidView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.fragment.app.FragmentActivity
import io.cyberyogi.arch.appComponent
import io.cyberyogi.arch.databinding.ActivityMainBinding
import io.cyberyogi.arch.ui.theme.ArchTheme
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

        viewModel.namesLiveData.observe(this) {
            when (it) {
                is Data.Loading -> println("names list: loading")
                is Data.Error -> println("names list: error is ${it.message}")
                is Data.Success -> println("names list is ${it.value}")
            }
        }

        val fillWidthModifier = Modifier.fillMaxWidth()
        setContent {
            ArchTheme {
                Column(modifier = Modifier.padding(16.dp)) {
                    TextField(
                        modifier = fillWidthModifier,
                        value = "Shiva",
                        onValueChange = { text -> print(text) },
                    )
                    TextField(
                        modifier = fillWidthModifier,
                        value = "Shakthi",
                        onValueChange = { text -> print(text) },
                    )
                    Button(
                        modifier = fillWidthModifier,
                        onClick = { viewModel.loadData() },
                    ) {
                        Text(text = "Submit")
                    }
                }
            }
        }
//        viewModel.loadData()

    }
}