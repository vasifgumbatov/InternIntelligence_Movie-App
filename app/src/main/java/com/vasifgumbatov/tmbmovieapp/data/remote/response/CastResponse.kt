package com.vasifgumbatov.tmbmovieapp.data.remote.response

import com.vasifgumbatov.tmbmovieapp.models.Cast
import com.google.gson.annotations.SerializedName

data class CastResponse(
    @SerializedName("id")
    val id: Int,
    @SerializedName("cast")
    val castResult: List<Cast>
)
