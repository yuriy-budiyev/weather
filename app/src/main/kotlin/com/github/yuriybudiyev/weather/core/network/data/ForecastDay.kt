package com.github.yuriybudiyev.weather.core.network.data

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ForecastDay(
    @SerialName("date")
    val date: String? = null,
    @SerialName("date_epoch")
    val dateEpoch: Long? = null,
    @SerialName("day")
    val day: DayForecast? = null,
    @SerialName("astro")
    val astro: AstroForecast? = null,
    @SerialName("hour")
    val hours: List<HourForecast>? = null,
)
