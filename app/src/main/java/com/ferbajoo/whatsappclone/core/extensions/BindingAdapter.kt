package com.ferbajoo.whatsappclone.core.extensions

import android.view.View
import android.widget.ImageView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.request.RequestOptions

/**
 * Created by Fernando U on 5/24/20.
 */

@BindingAdapter("imageUrl")
fun ImageView.setImage(url: String?) {
    Glide.with(context)
        .load(url)
        .apply(
            RequestOptions()
                .diskCacheStrategy(DiskCacheStrategy.AUTOMATIC)
        )
        .into(this)
}

@BindingAdapter("hideNumbers")
fun ConstraintLayout.hideNumber(hide: Boolean?) {
    this.visibility = if(hide == true) View.GONE else View.VISIBLE
}
