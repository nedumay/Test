package com.example.test.data

import android.app.Application
import com.example.test.InterfaceTest.ApiRick
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class App : Application() {

    lateinit var apiRick:ApiRick

    override fun onCreate(){
        super.onCreate()

        val retrofit = Retrofit.Builder()
            .baseUrl("https://rickandmortyapi.com/api")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        apiRick = retrofit.create(ApiRick::class.java)
    }

    fun getApi(): ApiRick {
        return apiRick
    }

}


