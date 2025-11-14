package com.github.yuriybudiyev.weather.core.network.data

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ForecastResponse(
    @SerialName("location")
    val location: Location? = null,
    @SerialName("current")
    val current: CurrentForecast? = null,
    @SerialName("forecast")
    val forecast: Forecast? = null,
)
