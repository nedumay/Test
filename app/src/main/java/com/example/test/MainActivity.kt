package com.example.test

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.test.adapters.RecyclerAdapter
import com.example.test.data.App
import com.example.test.data.dataItem
import com.example.test.databinding.ActivityMainBinding
import retrofit2.Response
import java.io.IOException


class MainActivity : AppCompatActivity() {

    private val list: List<dataItem> = ArrayList<dataItem>()
    lateinit var bindingMainActivity: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingMainActivity = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingMainActivity.root)

        val layoutManager = LinearLayoutManager(this)
        bindingMainActivity.recyclerView.setLayoutManager(layoutManager)

        val adapter: RecyclerAdapter = RecyclerAdapter(applicationContext, list)
        bindingMainActivity.recyclerView.adapter = adapter


    }

}