package com.ferbajoo.amplemindproject.feature


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.ferbajoo.amplemindproject.R
import com.ferbajoo.amplemindproject.core.base.BaseFragment
import com.ferbajoo.amplemindproject.core.koin.HomeViewModel
import kotlinx.android.synthetic.main.layout_fragment_home.*
import org.koin.androidx.viewmodel.ext.viewModel

class HomeFragment : BaseFragment() {

    private val viewModel: HomeViewModel by viewModel()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.layout_fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        tv_next.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_nextFragment)
        }

        Toast.makeText(context, viewModel.mjs, Toast.LENGTH_SHORT).show()
    }

}
