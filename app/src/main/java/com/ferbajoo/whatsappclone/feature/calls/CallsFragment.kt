package com.ferbajoo.whatsappclone.feature.calls

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.ferbajoo.whatsappclone.R
import com.ferbajoo.whatsappclone.feature.MainActivity

class CallsFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.calls_fragment_layout, container, false)
    }

    override fun onResume() {
        super.onResume()
        (activity as? MainActivity)?.hideChat()
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        (activity as? MainActivity)?.hideChat()

    }


}
