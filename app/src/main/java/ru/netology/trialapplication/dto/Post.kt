package ru.netology.trialapplication.dto

data class Post(
        val id: Long,
        val author: String,
        val published: String,
        val content: String,
        var likedByMe: Boolean = false,
        val likesCount: Int,
        val sharesCount: Int,
        val viewsCount: Int
)