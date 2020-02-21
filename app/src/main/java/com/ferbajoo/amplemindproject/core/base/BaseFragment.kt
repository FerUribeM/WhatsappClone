package com.ferbajoo.amplemindproject.core.base

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment

/**
 * Created by Fernando U on 2020-02-21.
 */
open class BaseFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

}