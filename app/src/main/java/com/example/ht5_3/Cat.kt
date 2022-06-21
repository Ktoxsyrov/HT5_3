package com.example.ht5_3

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize
import kotlinx.serialization.Serializable


@Serializable
data class Cat(
    val id: String = "",
    val url: String = "",
)