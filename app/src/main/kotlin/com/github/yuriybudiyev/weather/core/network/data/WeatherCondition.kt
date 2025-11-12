package com.github.yuriybudiyev.weather.core.network.data

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class WeatherCondition(
    @SerialName("text")
    val text: String? = null,
    @SerialName("icon")
    val icon: String? = null,
    @SerialName("code")
    val code: Int? = null,
)
