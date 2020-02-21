package com.ferbajoo.amplemindproject.feature


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.ferbajoo.amplemindproject.R
import com.ferbajoo.amplemindproject.core.base.BaseFragment

/**
 * A simple [Fragment] subclass.
 */
class NextFragment : BaseFragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.layout_fragment_next, container, false)
    }


}
