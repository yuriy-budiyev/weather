package com.github.yuriybudiyev.weather.core.network.data

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class LocationResponse(
    @SerialName("name")
    val name: String? = null,
    @SerialName("region")
    val region: String? = null,
    @SerialName("country")
    val country: String? = null,
    @SerialName("lat")
    val latitude: Float? = null,
    @SerialName("lon")
    val longitude: Float? = null,
    @SerialName("tz_id")
    val timeZoneId: String? = null,
    @SerialName("localtime_epoch")
    val localTimeEpoch: Long? = null,
    @SerialName("localtime")
    val localTime: String? = null,
)

@Serializable
data class ConditionResponse(
    @SerialName("text")
    val text: String? = null,
    @SerialName("icon")
    val icon: String? = null,
    @SerialName("code")
    val code: Int? = null,
)

@Serializable
data class CurrentForecastResponse(
    @SerialName("last_updated_epoch")
    val lastUpdatedEpoch: Long? = null,
    @SerialName("last_updated")
    val lastUpdated: String? = null,
    @SerialName("temp_c")
    val temperatureCelsius: Float? = null,
    @SerialName("temp_f")
    val temperatureFahrenheit: Float? = null,
    @SerialName("is_day")
    val isDay: Int? = null,
    @SerialName("condition")
    val condition: ConditionResponse? = null,
    @SerialName("wind_mph")
    val windMph: Float? = null,
    @SerialName("wind_kph")
    val windKph: Float? = null,
    @SerialName("wind_degree")
    val windDirectionDegree: Float? = null,
    @SerialName("wind_dir")
    val windDirection: String? = null,
    @SerialName("pressure_mb")
    val pressureMegaBars: Float? = null,
    @SerialName("pressure_in")
    val pressureInches: Float? = null,
    @SerialName("precip_mm")
    val precipitationMm: Float? = null,
    @SerialName("precip_in")
    val precipitationInches: Float? = null,
    @SerialName("humidity")
    val humidity: Float? = null,
    @SerialName("cloud")
    val cloudiness: Float? = null,
    @SerialName("feelslike_c")
    val temperatureCelsiusFeelsLike: Float? = null,
    @SerialName("feelslike_f")
    val temperatureFahrenheitFeelsLike: Float? = null,
    @SerialName("windchill_c")
    val temperatureCelsiusFeelsLikeWindAware: Float? = null,
    @SerialName("windchill_f")
    val temperatureFahrenheitFeelsLikeWindAware: Float? = null,
    @SerialName("heatindex_c")
    val temperatureCelsiusFeelsLikeHumidityAware: Float? = null,
    @SerialName("heatindex_f")
    val temperatureFahrenheitFeelsLikeHumidityAware: Float? = null,
    @SerialName("dewpoint_c")
    val dewPointCelsius: Float? = null,
    @SerialName("dewpoint_f")
    val dewPointFahrenheit: Float? = null,
    @SerialName("vis_km")
    val visibilityKm: Float? = null,
    @SerialName("vis_miles")
    val visibilityMiles: Float? = null,
    @SerialName("uv")
    val uvIndex: Float? = null,
    @SerialName("gust_mph")
    val windGustMph: Float? = null,
    @SerialName("gust_kph")
    val windGustKph: Float? = null,
)
