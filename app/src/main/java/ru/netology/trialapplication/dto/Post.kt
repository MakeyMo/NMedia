package ru.netology.trialapplication.dto

data class Post(
        val id: Long,
        val author: String,
        val published: String,
        val content: String,
        var likedByMe: Boolean = false,
        var likesCount: Int,
        var sharesCount: Int,
        var viewsCount: Int
) {
        fun likesCountSimpleView(likesCount: Int): String {
                var result: Int
                var remainder: Int
                var remaindersFirstChar: String

                if (likesCount / 1000000 != 0 ) {
                        result = likesCount / 1000000
                        remainder = likesCount % 1000000
                        if (remainder < 100000) {
                                return "$result M"
                        } else
                                remaindersFirstChar = remainder.toString().take(1)
                        return "$result.$remaindersFirstChar M"
                }

                if (likesCount / 10000 != 0 ) {
                        result = likesCount / 1000
                        return "$result K"
                }

                if (likesCount / 1000 != 0 ) {
                        result = likesCount / 1000
                        remainder = likesCount % 1000
                        if (remainder < 100) {
                                return "$result K"
                        } else
                        remaindersFirstChar = remainder.toString().take(1)
                        return "$result.$remaindersFirstChar K"
                }

                return likesCount.toString()
        }

        fun sharesCountSimpleView(sharesCount: Int): String {
                var result: Int
                var remainder: Int
                var remaindersFirstChar: String

                if (sharesCount / 1000000 != 0 ) {
                        result = sharesCount / 1000000
                        remainder = sharesCount % 1000000
                        if (remainder < 100000) {
                                return "$result M"
                        } else
                                remaindersFirstChar = remainder.toString().take(1)
                        return "$result.$remaindersFirstChar M"
                }

                if (sharesCount / 10000 != 0 ) {
                        result = sharesCount / 1000
                        return "$result K"
                }

                if (sharesCount / 1000 != 0 ) {
                        result = sharesCount / 1000
                        remainder = sharesCount % 1000
                        if (remainder < 100) {
                                return "$result K"
                        } else
                                remaindersFirstChar = remainder.toString().take(1)
                        return "$result.$remaindersFirstChar K"
                }

                return sharesCount.toString()
        }
}