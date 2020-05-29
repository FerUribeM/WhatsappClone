package com.ferbajoo.whatsappclone.feature.chats.models

data class ChatModel(
    val imageUrl : String,
    val name: String,
    val lastMessage: String,
    val date: String,
    val number: Int = 0
)

fun getChatModels(): MutableList<ItemChatViewModel> {
    val image = "https://www.dictionary.com/e/wp-content/uploads/2018/03/circle_game-1.jpg"
    val chats = mutableListOf<ItemChatViewModel>()
    chats.apply {
        add(ItemChatViewModel(ChatModel(image,"Rita", "El ultimo mensaje que llego en este chat", "11/05/2020")))
        add(ItemChatViewModel(ChatModel(image,"Pedro", "El ultimo mensaje que llego en este chat", "12/05/2020", 3)))
        add(ItemChatViewModel(ChatModel(image,"Basti", "El ultimo mensaje que llego en este chat", "14/05/2020")))
        add(ItemChatViewModel(ChatModel(image,"Grabiel", "El ultimo mensaje que llego en este chat", "15/05/2020")))
        add(ItemChatViewModel(ChatModel(image,"Denis", "El ultimo mensaje que llego en este chat", "19/05/2020", 4)))
        add(ItemChatViewModel(ChatModel(image,"Nich", "El ultimo mensaje que llego en este chat", "20/05/2020")))
        add(ItemChatViewModel(ChatModel(image,"Fernando", "El ultimo mensaje que llego en este chat", "21/05/2020")))
        add(ItemChatViewModel(ChatModel(image,"Gustavo", "El ultimo mensaje que llego en este chat", "22/05/2020", 5)))
        add(ItemChatViewModel(ChatModel(image,"Alberto", "El ultimo mensaje que llego en este chat", "25/05/2020")))
        add(ItemChatViewModel(ChatModel(image,"Diego", "El ultimo mensaje que llego en este chat", "28/05/2020", 2)))
    }
    return chats
}

class ItemChatViewModel(model: ChatModel){
    val name = model.name
    val imageUrl = model.imageUrl
    val lastMessage = model.lastMessage
    val date = model.date
    val numberMessage = model.number.toString()

    val hideNumbers = model.number == 0

}
