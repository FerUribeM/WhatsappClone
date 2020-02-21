package com.ferbajoo.amplemindproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.Navigation
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupNavigation()
    }

    private fun setupNavigation() {
        setSupportActionBar(toolbar)

        NavigationUI.setupActionBarWithNavController(
            this, Navigation.findNavController(this, R.id.nav_host)
        )
    }

    override fun onSupportNavigateUp() = NavHostFragment.findNavController(nav_host).navigateUp()
}
