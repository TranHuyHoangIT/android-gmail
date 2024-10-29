package com.example.gmail

data class Email(val sender: String, val subject: String, val preview: String, val time: String, var isStarred: Boolean = false)

