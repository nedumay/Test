package com.example.test.InterfaceTest

import com.example.test.data.dataItem
import retrofit2.Call
import retrofit2.http.GET


interface ApiRick {
    @GET("Rick.json")
    fun messages(): Call<List<dataItem?>?>?

}