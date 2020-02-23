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

    fun toInitials(firstName: String?, lastName:String?): String? {
        var initials: String = ""

        if (firstName != null && firstName.trim().isNotEmpty()) initials += firstName[0].toUpperCase()
        if (lastName != null && lastName.trim().isNotEmpty()) initials += lastName[0].toUpperCase()

        if (initials.length == 0) {
            return null
        } else {
            return initials
        }
    }
}
