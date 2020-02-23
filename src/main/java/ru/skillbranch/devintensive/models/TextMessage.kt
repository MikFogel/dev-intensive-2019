package ru.skillbranch.devintensive.models

import java.util.*

class TextMessage(
    id: String,
    from: User?,
    chat: Chat,
    isIncomming: Boolean = false,
    date:Date =  Date(),
    var text: String
    ) : BaseMessage (
    id, from, chat, isIncomming, date) {

    override fun formatMessage(): String {
        return "id: $id, from: ${from?.firstName}, ${if (isIncoming) "получил" else "отправил"} текст $text"
    }
}