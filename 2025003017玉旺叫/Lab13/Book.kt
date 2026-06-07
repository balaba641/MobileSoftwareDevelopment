package com.example.bookshelf.model

data class Book(
    val id: String,
    val coverUrl: String,
    val title: String,
    val author: String = "",
    val description: String = ""
) {
    // 获取封面图片URL
    fun getCoverImageUrl(): String {
        return coverUrl
    }

    // 获取书籍标题
    fun getBookTitle(): String {
        return title
    }
}