package com.ferbajoo.whatsappclone.feature

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.ferbajoo.whatsappclone.R
import com.ferbajoo.whatsappclone.feature.calls.CallsFragment
import com.ferbajoo.whatsappclone.feature.camera.CameraFragment
import com.ferbajoo.whatsappclone.feature.chats.ChatFragment
import com.ferbajoo.whatsappclone.feature.status.StatusFragment

class TabsWhatsappPager(fragmentManager: FragmentManager, context: Context) :
    FragmentPagerAdapter(fragmentManager, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {

    private val fragmentTabs = mutableListOf<Pair<Fragment, String>>()

    init {
        fragmentTabs.add(Pair(CameraFragment(), context.getString(R.string.camera)))
        fragmentTabs.add(Pair(ChatFragment(), context.getString(R.string.chat)))
        fragmentTabs.add(Pair(StatusFragment(), context.getString(R.string.status)))
        fragmentTabs.add(Pair(CallsFragment(), context.getString(R.string.calls)))
    }

    override fun getItem(position: Int): Fragment {
        return fragmentTabs[position].first
    }

    override fun getCount() = fragmentTabs.size

    override fun getPageTitle(position: Int): CharSequence? {
        return fragmentTabs[position].second
    }

    fun getTabView(context: Context): View? {
        return LayoutInflater.from(context).inflate(R.layout.custom_tab, null)
    }

}
