package com.github.yuriybudiyev.weather.core.data.repository

import com.github.yuriybudiyev.weather.core.data.model.WeatherForecast
import com.github.yuriybudiyev.weather.core.network.retrofit.RetrofitDataSource
import java.time.Instant
import java.time.LocalDateTime
import java.time.ZoneId
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class WeatherRepository @Inject constructor(
    private val dataSource: RetrofitDataSource,
) {

    suspend fun getCurrentWeather(): WeatherForecast {
        val weather = dataSource.getWeather()
        return WeatherForecast(
            locationName = weather.location?.name.orEmpty(),
            locationRegion = weather.location?.region.orEmpty(),
            currentTemp = weather.current?.tempC ?: 0f,
            lastUpdated = LocalDateTime.ofInstant(
                Instant.ofEpochSecond(weather.current?.lastUpdatedEpoch ?: 0L),
                ZoneId.systemDefault(),
            ),
        )
    }
}
