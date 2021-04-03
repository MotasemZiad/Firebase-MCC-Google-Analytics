package com.ziad.motasem.myapp.adapter
import android.widget.ImageView
import androidx.databinding.BindingAdapter

object HolderAdapter {

    @JvmStatic
    @BindingAdapter("image")
    fun image(view: ImageView, path: Int) {
        view.setImageResource(path)
    }

}