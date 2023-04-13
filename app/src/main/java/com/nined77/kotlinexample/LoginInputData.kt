package com.nined77.kotlinexample

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class LoginInputData (
    val username: String,
    var password: String
): Parcelable