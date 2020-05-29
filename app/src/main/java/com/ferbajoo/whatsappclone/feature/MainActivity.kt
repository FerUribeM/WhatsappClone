package com.ferbajoo.whatsappclone.feature

import android.os.Bundle
import android.view.Menu
import com.ferbajoo.whatsappclone.R
import com.ferbajoo.whatsappclone.core.base.BaseActivity
import com.ferbajoo.whatsappclone.core.koin.HomeViewModel
import kotlinx.android.synthetic.main.activity_main.*
import org.koin.androidx.viewmodel.ext.viewModel

class MainActivity : BaseActivity() {

    private val viewModel: HomeViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setSupportActionBar(toolbar)

        setupViewPager()

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_whatsapp, menu)
        return true
    }

    private fun setupViewPager() {
        val adapter = TabsWhatsappPager(supportFragmentManager, this)
        viewpager.adapter = adapter

        tab_layout.setupWithViewPager(viewpager)

        val tab = tab_layout.getTabAt(0)
        tab?.customView = adapter.getTabView(this)

    }

    fun showChat(){
        fb_chat?.show()
    }

    fun hideChat() {
        fb_chat?.hide()
    }

}
