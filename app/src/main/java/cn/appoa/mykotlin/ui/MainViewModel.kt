package cn.appoa.mykotlin.ui

import androidx.lifecycle.ViewModel
import cn.appoa.mykotlin.data.WeatherRepository

class MainViewModel(private val repository: WeatherRepository) : ViewModel() {

    fun isWeatherCached() = repository.isWeatherCached()

}