package ru.skillbranch.devintensive.models

import android.service.voice.AlwaysOnHotwordDetector
import ru.skillbranch.devintensive.utils.TypeMessage
import java.util.*

abstract class BaseMessage(
    val id: String,
    val from: User?,
    val chat: Chat,
    val isIncoming: Boolean = false,
    val date: Date = Date()
) {

    abstract fun formatMessage() : String

    companion object AbstractFactory {
        var lastID = -1

        fun makeMessage(from: User?, chat: Chat, date: Date = Date(), isIncoming: Boolean, type: TypeMessage, payload: Any?): BaseMessage {
            lastID ++

            var message = when(type) {
                TypeMessage.IMAGE -> ImageMessage("$lastID", from, chat, date=date, imageUrl = payload as String)
                TypeMessage.TEXT -> TextMessage("$lastID", from, chat, date = date, text = payload as String)
            }
            return message
        }
    }

}

//from, chat, date, type, payload, isIncoming = false