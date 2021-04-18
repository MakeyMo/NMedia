package ru.netology.trialapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import ru.netology.trialapplication.databinding.ActivityMainBinding
import ru.netology.trialapplication.dto.Post

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val post = Post(
                id = 1,
                author = "Нетология. Университет интернет-профессий будущего",
                published = "21 мая в 18:36",
                content = "Привет, это новая Нетология! Когда-то Нетология начиналась с интенсивов по онлайн-маркетингу. Затем появились курсы по дизайну, разработке, аналитике и управлению. Мы растем сами и помогаем расти студентам: от новичков до уверенных профессионалов. Но самое важное остается с нами: мы верим, что в каждом уже есть сила, которая заставляет хотеть больше, целиться выше, бежать быстрее. Наша миссия - помочь встать на путь роста и начать цепочку перемен ➝ http://netolo.gy/fyb",
                likedByMe = false,
                likesCount = 10,
                sharesCount = 5
        )
        with(binding) {
            txtAuthor.text = post.author
            txtPublished.text = post.published
            txtContent.text = post.content
            txtLikesCount.text = post.likesCount.toString()
//            if (post.likedByMe) {
//                imgLike?.setImageResource(R.drawable.ic_liked_24)
//            }
            imgLike?.setOnClickListener {
                post.likedByMe = !post.likedByMe
                imgLike.setImageResource(
                        if (post.likedByMe) R.drawable.ic_liked_24 else R.drawable.ic_like_24
                )
                if (post.likedByMe) post.likesCount += 1 else post.likesCount
            }
        }
    }
}