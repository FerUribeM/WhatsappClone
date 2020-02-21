package com.ferbajoo.amplemindproject.core.base

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.ferbajoo.amplemindproject.core.koin.injectFeature

/**
 * Created by Fernando U on 2020-02-21.
 */
open class BaseActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        injectFeature()
    }

}