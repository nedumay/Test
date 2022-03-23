package com.example.test.data

import android.net.Uri

data class dataItem(
    val name: String,
    val status: String,
    val gender: String,
    val location: String,
    val url: Uri
)

data class Result (val total_count: Int, val incomplete_result: Boolean, val items: List<dataItem>)