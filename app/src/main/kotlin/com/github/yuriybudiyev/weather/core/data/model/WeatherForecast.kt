package com.github.yuriybudiyev.weather.core.data.model

import java.time.LocalDateTime

data class WeatherForecast(
    val locationName: String,
    val locationRegion: String,
    val currentTemp: Float,
    val lastUpdated: LocalDateTime,
)