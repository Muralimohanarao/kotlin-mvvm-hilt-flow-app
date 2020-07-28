package com.prasan.kotlinmvvmhiltflowapp.model.datamodel

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Small(
    @Json(name = "https")
    val https: String
)