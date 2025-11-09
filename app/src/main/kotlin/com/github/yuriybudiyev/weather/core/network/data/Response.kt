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

)