package com.ziad.motasem.myapp.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Category(val id: String, val name: String, val pathImage: Int) : Parcelable