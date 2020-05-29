package com.ferbajoo.whatsappclone.feature.chats

import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.RecyclerView
import com.amplemind.presentation.adapter.GenericRecyclerAdapter
import com.amplemind.presentation.adapter.GenericRecyclerViewHolder
import com.ferbajoo.whatsappclone.BR
import com.ferbajoo.whatsappclone.R
import com.ferbajoo.whatsappclone.feature.chats.models.ItemChatViewModel

class ChatAdapter : GenericRecyclerAdapter<ItemChatViewModel>() {

    override fun getLayoutResId() = R.layout.chat_item_layout

    override fun getVariableId() = BR.viewModel

    override fun getViewHolder(binding: ViewDataBinding): RecyclerView.ViewHolder {
        return GenericRecyclerViewHolder<ItemChatViewModel>(binding)
    }

}
