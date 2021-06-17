package ru.netology.trialapplication.repository

import androidx.lifecycle.LiveData
import ru.netology.trialapplication.dto.Post

interface PostRepository {
    fun get(): LiveData<Post>
    fun like()
    fun share()
}