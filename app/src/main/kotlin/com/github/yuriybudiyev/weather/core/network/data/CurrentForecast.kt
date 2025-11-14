package com.github.yuriybudiyev.weather.core.network.data

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class CurrentForecast(
    @SerialName("last_updated_epoch")
    val lastUpdatedEpoch: Long? = null,
    @SerialName("last_updated")
    val lastUpdated: String? = null,
    @SerialName("temp_c")
    val tempC: Float? = null,
    @SerialName("temp_f")
    val tempF: Float? = null,
    @SerialName("is_day")
    val isDay: Int? = null,
    @SerialName("condition")
    val condition: WeatherCondition? = null,
    @SerialName("wind_mph")
    val windMph: Float? = null,
    @SerialName("wind_kph")
    val windKph: Float? = null,
    @SerialName("wind_degree")
    val windDegree: Float? = null,
    @SerialName("wind_dir")
    val windDir: String? = null,
    @SerialName("pressure_mb")
    val pressureMb: Float? = null,
    @SerialName("pressure_in")
    val pressureIn: Float? = null,
    @SerialName("precip_mm")
    val precipMm: Float? = null,
    @SerialName("precip_in")
    val precipIn: Float? = null,
    @SerialName("humidity")
    val humidity: Float? = null,
    @SerialName("cloud")
    val cloud: Float? = null,
    @SerialName("feelslike_c")
    val feelsLikeC: Float? = null,
    @SerialName("feelslike_f")
    val feelsLikeF: Float? = null,
    @SerialName("windchill_c")
    val windchillC: Float? = null,
    @SerialName("windchill_f")
    val windchillF: Float? = null,
    @SerialName("heatindex_c")
    val heatIndexC: Float? = null,
    @SerialName("heatindex_f")
    val heatIndexF: Float? = null,
    @SerialName("dewpoint_c")
    val dewPointC: Float? = null,
    @SerialName("dewpoint_f")
    val dewPointF: Float? = null,
    @SerialName("vis_km")
    val visKm: Float? = null,
    @SerialName("vis_miles")
    val visMiles: Float? = null,
    @SerialName("uv")
    val uv: Float? = null,
    @SerialName("gust_mph")
    val gustMph: Float? = null,
    @SerialName("gust_kph")
    val gustKph: Float? = null,
)
