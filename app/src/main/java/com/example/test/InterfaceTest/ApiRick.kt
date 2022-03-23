package com.example.test.InterfaceTest

import retrofit2.http.GET
import retrofit2.http.Query

interface ApiRick {
    @GET("search/data")
    fun search(@Query)

}