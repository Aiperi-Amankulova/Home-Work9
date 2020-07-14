package com.example.homework9

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class UserData(
    val tauranga: String,
    val lakhimpur: String,
    val unnao: String,
    var saga: String,
    val pikine: String,
    val naney: String,
    var changping: String,
    var lubao: String,
    var bratsk: String,
    var tulock: String
) : Parcelable