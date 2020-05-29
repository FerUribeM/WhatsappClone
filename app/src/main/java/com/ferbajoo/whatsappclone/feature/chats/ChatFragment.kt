package com.ferbajoo.whatsappclone.feature.chats

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import com.ferbajoo.whatsappclone.R
import com.ferbajoo.whatsappclone.core.base.BaseFragment
import com.ferbajoo.whatsappclone.feature.MainActivity
import com.ferbajoo.whatsappclone.feature.chats.models.getChatModels
import kotlinx.android.synthetic.main.chat_fragment_layout.*

class ChatFragment : BaseFragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.chat_fragment_layout, container, false)
    }

    override fun onResume() {
        super.onResume()
        (activity as? MainActivity)?.showChat()
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setupChats()
    }

    private fun setupChats() {
        val adapter = ChatAdapter()
        rv_chats.adapter = adapter
        adapter.setData(getChatModels())
    }


}
