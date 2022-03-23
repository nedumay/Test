package com.example.test.data

import android.app.Application
import android.widget.Toast
import com.example.test.InterfaceTest.ApiRick
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class App : Application() {

    lateinit var apiRick:ApiRick
    lateinit var retrofit: Retrofit

    override fun onCreate(){
        super.onCreate()

        retrofit = Retrofit.Builder()
            .baseUrl("https://rickandmortyapi.com/api")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        apiRick = retrofit.create(ApiRick::class.java)

        /*
        val dataItem: Call<List<dataItem?>?>? = apiRick.messages()
        dataItem?.enqueue(object : Callback<List<dataItem?>?> {
            override fun onResponse(call: Call<List<dataItem?>?>?, response: Response<List<dataItem?>?>) {
                Toast.makeText(applicationContext,"ok", Toast.LENGTH_SHORT).show()
            }

            override fun onFailure(call: Call<List<dataItem?>?>?, t: Throwable?) {
                Toast.makeText(applicationContext,"error", Toast.LENGTH_SHORT).show()
            }
        })*/
    }

    fun getApi(): ApiRick {
        return apiRick
    }

}


