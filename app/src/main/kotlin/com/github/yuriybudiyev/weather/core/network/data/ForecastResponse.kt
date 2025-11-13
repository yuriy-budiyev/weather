package com.github.yuriybudiyev.weather.core.network.data

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ForecastResponse(
    @SerialName("location")
    val location: Location? = Location(),
    @SerialName("current")
    val current: CurrentForecast? = CurrentForecast(),
    @SerialName("forecast")
    val forecast: Forecast? = Forecast(),
)
