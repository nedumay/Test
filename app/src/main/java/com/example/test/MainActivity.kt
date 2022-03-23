package com.example.test

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.test.InterfaceTest.ApiRick
import com.example.test.data.dataItem
import com.example.test.databinding.ActivityMainBinding
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


class MainActivity : AppCompatActivity() {

    lateinit var bindingMainActivity: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingMainActivity = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingMainActivity.root)
        val retrofit = Retrofit.Builder()
            .baseUrl("https://rickandmortyapi.com/api/character")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        val apiRick: ApiRick = retrofit.create(ApiRick::class.java)

        //val messages: Call<List<dataItem?>?>? = apiRick.messages()


    }

}