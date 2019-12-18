package cn.appoa.mykotlin.data.network.api


import cn.appoa.mykotlin.data.model.weather.City
import cn.appoa.mykotlin.data.model.weather.County
import cn.appoa.mykotlin.data.model.weather.Province
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface PlaceService {

    @GET("api/china")
    fun getProvinces(): Call<MutableList<Province>>

    @GET("api/china/{provinceId}")
    fun getCities(@Path("provinceId") provinceId: Int): Call<MutableList<City>>

    @GET("api/china/{provinceId}/{cityId}")
    fun getCounties(@Path("provinceId") provinceId: Int, @Path("cityId") cityId: Int): Call<MutableList<County>>

}