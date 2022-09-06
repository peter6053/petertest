package com.example.testdev.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.testdev.R
import com.example.testdev.adapter.HomeAdapter
import com.example.testdev.databinding.ActivityHomeBinding
import com.example.testdev.interfaces.HomeRecyclerView
import com.example.testdev.model.Item
import com.example.testdev.viewmodel.HomeViewModel
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity(), HomeRecyclerView {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding:ActivityHomeBinding = DataBindingUtil.setContentView(this,R.layout.activity_home);
        val viewModel = ViewModelProvider(this).get(HomeViewModel::class.java)
        val mHomeAdapter = HomeAdapter()
        mHomeAdapter.homeListener = this
        nasaRV.setAdapter(mHomeAdapter)

        viewModel!!.nasaData.observe(this,
            Observer<List<Any>> { mNasaModel ->
                ///if any thing will chnage the adapter  updates the UI
                mHomeAdapter?.setItemsList(mNasaModel as ArrayList<Item>)
                nasaPD?.visibility = View.GONE
            })
    }

    override fun onClick(item: Item) {
        val intent = Intent(this,DetailActivity::class.java)
        intent.putExtra("Item",item)
        startActivity(intent)
    }
}