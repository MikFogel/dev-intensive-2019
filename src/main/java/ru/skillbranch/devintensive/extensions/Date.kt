package ru.skillbranch.devintensive.extensions

import java.text.SimpleDateFormat
import java.util.*
import java.util.regex.Pattern

fun Date.format(pattern: String="HH:mm:ss dd.MM.yy") : String {
    var dateFormat = SimpleDateFormat(pattern, Locale("ru"))
    return dateFormat.format(this)
}