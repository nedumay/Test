package com.example.test

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.test.InterfaceTest.ApiRick
import com.example.test.adapters.RecyclerAdapter
import com.example.test.data.App
import com.example.test.data.dataItem
import com.example.test.databinding.ActivityMainBinding
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


class MainActivity : AppCompatActivity() {

    lateinit var apiRick:ApiRick
    lateinit var retrofit: Retrofit
    private val list: List<dataItem> = ArrayList()
    lateinit private var bindingMainActivity: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingMainActivity = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingMainActivity.root)

        val layoutManager = LinearLayoutManager(this)
        bindingMainActivity.recyclerView.setLayoutManager(layoutManager)

        val adapter = RecyclerAdapter(applicationContext, list)
        bindingMainActivity.recyclerView.adapter = adapter
    }

}


