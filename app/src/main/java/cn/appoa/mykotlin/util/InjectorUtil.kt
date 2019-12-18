package cn.appoa.mykotlin.util

import cn.appoa.mykotlin.data.PlaceRepository
import cn.appoa.mykotlin.data.WeatherRepository
import cn.appoa.mykotlin.data.db.CoolWeatherDatabase
import cn.appoa.mykotlin.data.network.CoolWeatherNetwork
import cn.appoa.mykotlin.ui.MainModelFactory
import cn.appoa.mykotlin.ui.area.ChooseAreaModelFactory
import cn.appoa.mykotlin.ui.weather.WeatherModelFactory

object InjectorUtil {

    private fun getPlaceRepository() = PlaceRepository.getInstance(CoolWeatherDatabase.getPlaceDao(), CoolWeatherNetwork.getInstance())

    private fun getWeatherRepository() = WeatherRepository.getInstance(CoolWeatherDatabase.getWeatherDao(), CoolWeatherNetwork.getInstance())

    fun getChooseAreaModelFactory() = ChooseAreaModelFactory(getPlaceRepository())

    fun getWeatherModelFactory() = WeatherModelFactory(getWeatherRepository())

    fun getMainModelFactory() = MainModelFactory(getWeatherRepository())

}