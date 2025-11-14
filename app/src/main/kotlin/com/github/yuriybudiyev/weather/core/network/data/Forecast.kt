package com.github.yuriybudiyev.weather.core.network.data

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Forecast(
    @SerialName("forecastday")
    val forecastDays: List<ForecastDay>? = null,
)
