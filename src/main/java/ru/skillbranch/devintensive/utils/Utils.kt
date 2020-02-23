package ru.skillbranch.devintensive.utils

enum class TypeMessage {
    IMAGE, TEXT
}

enum class TimeUnit {
    SECOND, MINUTE, HOUR, DAY
}

object Utils {
    fun parseFullName(fullName: String?) : Pair<String?, String?> {

        var fullName = if (fullName == "" || fullName == " ") null else fullName

        val splitted : List<String>? = fullName?.split(" ")

        val firstName = splitted?.getOrNull(0)
        val lastName = splitted?.getOrNull(1)

        return Pair(firstName, lastName)
    }
}