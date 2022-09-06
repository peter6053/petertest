package com.example.testdev.ui

import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.testdev.R
import com.example.testdev.databinding.ActivityDetailBinding
import com.example.testdev.model.Item

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityDetailBinding = DataBindingUtil.setContentView(this,R.layout.activity_detail);
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        val item = intent.getSerializableExtra("Item") as Item
        binding.data = item.data.get(0)
        binding.link = item.links.get(0)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == android.R.id.home){
            finish()
            return true
        }
        return false
    }
}