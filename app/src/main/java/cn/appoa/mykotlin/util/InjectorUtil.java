package cn.appoa.mykotlin.util;

object InjectorUtil{

private fun getPlaceRepository()=PlaceRepository.getInstance(CoolWeatherDatabase.getPlaceDao(),CoolWeatherNetwork.getInstance())

private fun getWeatherRepository()=WeatherRepository.getInstance(CoolWeatherDatabase.getWeatherDao(),CoolWeatherNetwork.getInstance())

        fun getChooseAreaModelFactory()=ChooseAreaModelFactory(getPlaceRepository())

        fun getWeatherModelFactory()=WeatherModelFactory(getWeatherRepository())

        fun getMainModelFactory()=MainModelFactory(getWeatherRepository())

        }
