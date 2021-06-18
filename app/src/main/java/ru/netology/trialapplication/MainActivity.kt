package ru.netology.trialapplication

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import logicFunctions.NumericHandlers
import ru.netology.trialapplication.databinding.ActivityMainBinding
import ru.netology.trialapplication.viewmodel.PostViewModel

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val viewModel: PostViewModel by viewModels()
        with(binding) {
            imgLike.setOnClickListener {
                viewModel.like()
            }
            imgShare.setOnClickListener {
                viewModel.share()
            }
        }
        viewModel.data.observe(this) { post ->
            with(binding) {
                txtAuthor.text = post.author
                txtPublished.text = post.published
                txtContent.text = post.content
                txtLikesCount.text = post.likesCount.toString()
                txtSharesCount.text = post.sharesCount.toString()
                txtViewsCount.text = post.viewsCount.toString()
//                if (post.likedByMe) {
//                    imgLike.setImageResource(R.drawable.ic_liked_24)
//                }
                imgLike.setImageResource(
                        if (post.likedByMe) R.drawable.ic_liked_24 else R.drawable.ic_like_24
                )
                txtLikesCount.text = NumericHandlers.countersSimpleView(post.likesCount)
                txtSharesCount.text = NumericHandlers.countersSimpleView(post.sharesCount)
            }
        }
    }
}