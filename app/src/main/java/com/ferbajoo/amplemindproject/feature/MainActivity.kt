package com.ferbajoo.amplemindproject.feature

import android.os.Bundle
import androidx.navigation.Navigation
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import com.ferbajoo.amplemindproject.R
import com.ferbajoo.amplemindproject.core.base.BaseActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupNavigation()
    }

    private fun setupNavigation() {
        setSupportActionBar(toolbar)

        NavigationUI.setupActionBarWithNavController(
            this, Navigation.findNavController(
                this,
                R.id.nav_host
            )
        )
    }

    override fun onSupportNavigateUp() = NavHostFragment.findNavController(nav_host).navigateUp()
}
