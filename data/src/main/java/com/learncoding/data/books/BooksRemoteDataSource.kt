package com.learncoding.data.books

import com.learncoding.domain.entities.Volume

interface BooksRemoteDataSource {
    suspend fun getBooks(author: String): Result<List<Volume>>
}