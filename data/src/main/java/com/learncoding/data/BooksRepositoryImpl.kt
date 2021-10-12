package com.learncoding.data

import com.learncoding.data.books.BooksLocalDataSource
import com.learncoding.domain.entities.Volume
import com.learncoding.domain.repositories.BooksRepository

class BooksRepositoryImpl(
    private val localDataSource: BooksLocalDataSource,
    private val remoteDataSource: BooksRemoteDataSource
) : BooksRepository {
    override suspend fun getRemoteBooks(author: String): Result<List<Volume>> {
        TODO("Not yet implemented")
    }

    override suspend fun getBookmarks(): kotlinx.coroutines.flow.Flow<List<Volume>> {
        TODO("Not yet implemented")
    }

    override suspend fun bookmark(book: Volume) {
        TODO("Not yet implemented")
    }

    override suspend fun unbookmark(book: Volume) {
        TODO("Not yet implemented")
    }

}