package com.mobile.storyapp.response

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

data class StoryResponse (
    @field: SerializedName("error")
    val error: Boolean,

    @field: SerializedName("message")
    val message: String,

    @field: SerializedName("listStory")
    val listStory: List<ListStory>
)

@Parcelize
data class ListStory(
    @field:SerializedName("id")
    val id: String?,

    @field:SerializedName("name")
    val name: String?,

    @field:SerializedName("photoUrl")
    val photoUrl: String?,

    @field:SerializedName("description")
    val description: String?,

    @field:SerializedName("lat")
    val lat: Double?,

    @field:SerializedName("lon")
    val lon: Double?,
): Parcelable
