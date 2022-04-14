package com.example.juaraandroidapp

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class User (
    var avatar: Int?,
    var username: String?,
    var name: String?,
    var location: String?,
    var repository: String?,
    var company: String?,
    var followers: String?,
    var following: String?
        ) : Parcelable