package com.example.test.InterfaceTest

import android.net.Uri
import com.example.test.data.dataItem
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query


interface ApiRick {
    @GET("character")
    fun messages(): Call<List<dataItem?>?>?

}

