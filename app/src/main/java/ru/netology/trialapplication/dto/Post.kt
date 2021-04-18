package ru.netology.trialapplication.dto


data class Post(
        val id: Long,
        val author: String,
        val published: String,
        val content: String,
        var likedByMe: Boolean = false,
        var likesCount: Int,
        var sharesCount: Long
)