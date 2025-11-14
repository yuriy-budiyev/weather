package com.github.yuriybudiyev.weather.core.network.data

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class DayForecast(
    @SerialName("maxtemp_c")
    val maxtempC: Float? = null,
    @SerialName("maxtemp_f")
    val maxtempF: Float? = null,
    @SerialName("mintemp_c")
    val mintempC: Float? = null,
    @SerialName("mintemp_f")
    val mintempF: Float? = null,
    @SerialName("avgtemp_c")
    val avgtempC: Float? = null,
    @SerialName("avgtemp_f")
    val avgtempF: Float? = null,
    @SerialName("maxwind_mph")
    val maxwindMph: Float? = null,
    @SerialName("maxwind_kph")
    val maxwindKph: Float? = null,
    @SerialName("totalprecip_mm")
    val totalprecipMm: Float? = null,
    @SerialName("totalprecip_in")
    val totalprecipIn: Float? = null,
    @SerialName("totalsnow_cm")
    val totalsnowCm: Float? = null,
    @SerialName("avgvis_km")
    val avgvisKm: Float? = null,
    @SerialName("avgvis_miles")
    val avgvisMiles: Float? = null,
    @SerialName("avghumidity")
    val avghumidity: Float? = null,
    @SerialName("daily_will_it_rain")
    val dailyWillItRain: Int? = null,
    @SerialName("daily_chance_of_rain")
    val dailyChanceOfRain: Float? = null,
    @SerialName("daily_will_it_snow")
    val dailyWillItSnow: Int? = null,
    @SerialName("daily_chance_of_snow")
    val dailyChanceOfSnow: Float? = null,
    @SerialName("condition")
    val condition: WeatherCondition? = null,
    @SerialName("uv")
    val uv: Float? = null,
)
