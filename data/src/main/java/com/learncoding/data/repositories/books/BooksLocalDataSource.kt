package com.learncoding.data.repositories.books

import com.learncoding.domain.entities.Volume
import kotlinx.coroutines.flow.Flow

interface BooksLocalDataSource {
    suspend fun bookmark(book: Volume)
    suspend fun unbookmark(book: Volume)
    suspend fun getBookmarks(): Flow<List<Volume>>
}