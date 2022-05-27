package com.example.aeth

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.LayoutManager

class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView:RecyclerView
    private lateinit var recyclerAdapter: RecyclerAdapter

    private var layoutManager: LayoutManager?= null
    private var adapter:RecyclerView.Adapter<RecyclerAdapter.ViewHolder>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        layoutManager =LinearLayoutManager(this)

        recyclerView . layoutManager = layoutManager;

        val recyclerView = null


        adapter = RecyclerAdapter()
        recyclerAdapter = adapter as RecyclerAdapter
    }
}