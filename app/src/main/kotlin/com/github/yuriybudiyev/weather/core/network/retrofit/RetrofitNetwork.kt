package com.github.yuriybudiyev.weather.core.network.retrofit

import com.github.yuriybudiyev.weather.core.network.data.ForecastResponse
import kotlinx.serialization.json.Json
import okhttp3.MediaType.Companion.toMediaType
import retrofit2.Retrofit
import retrofit2.converter.kotlinx.serialization.asConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query
import javax.inject.Inject
import javax.inject.Singleton

private interface WeatherService {

    @GET("forecast.json")
    suspend fun getWeather(
        @Query("key")
        key: String,
        @Query("q")
        query: String,
        @Query("days")
        days: Int,
    ): ForecastResponse
}

@Singleton
class RetrofitDataSource @Inject constructor() {

    private val weatherService: WeatherService

    init {
        val networkJson = Json { ignoreUnknownKeys = true }
        weatherService = Retrofit
            .Builder()
            .baseUrl("https://api.weatherapi.com/v1/")
            .addConverterFactory(networkJson.asConverterFactory("application/json".toMediaType()))
            .build()
            .create(WeatherService::class.java)
    }

    suspend fun getWeather(): ForecastResponse =
        weatherService.getWeather(
            key = "fa8b3df74d4042b9aa7135114252304",
            query = "55.7569,37.6151",
            days = 3,
        )
}
