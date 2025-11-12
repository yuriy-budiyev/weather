package com.github.yuriybudiyev.weather.core.network.data

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Location(
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
    val tzId: String? = null,
    @SerialName("localtime_epoch")
    val localtimeEpoch: Long? = null,
    @SerialName("localtime")
    val localtime: String? = null,
)
