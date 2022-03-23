package com.example.test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.test.adapters.RecyclerAdapter
import com.example.test.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var bindingMainActivity: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingMainActivity = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingMainActivity.root)
        var linearLayoutManager: LinearLayoutManager = LinearLayoutManager(applicationContext)
        bindingMainActivity.recyclerView.layoutManager
    }

    override fun onResume() {
        super.onResume()
    }
}