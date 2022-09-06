package com.example.testdev.model

import android.util.Log
import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class Link(
    @SerializedName("href")
    val href: String,
    val rel: String,
    val render: String
) : Serializable {
    companion object {
        @JvmStatic
        @BindingAdapter("href")
        fun loadImage(imageView: ImageView, imageURL: String) {
            Log.e("imsgeurl", imageURL)
            Glide.with(imageView.context)
                .setDefaultRequestOptions(
                    RequestOptions()
                )
                .load(imageURL)
                .into(imageView)
        }

    }
}