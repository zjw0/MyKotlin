package cn.appoa.mykotlin.ui.area

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import cn.appoa.mykotlin.data.PlaceRepository

class ChooseAreaModelFactory(private val repository: PlaceRepository) : ViewModelProvider.NewInstanceFactory() {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return ChooseAreaViewModel(repository) as T
    }
}