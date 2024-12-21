package com.vasifgumbatov.tmbmovieapp.data.remote.response

import com.vasifgumbatov.tmbmovieapp.models.Genre
import com.google.gson.annotations.SerializedName

data class GenreResponse(
    @SerializedName("genres")
    val genres: List<Genre>
)