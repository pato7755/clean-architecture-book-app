package com.learncoding.data.db

import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.learncoding.data.entities.BookEntity
import kotlinx.coroutines.flow.Flow

interface BookDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun saveBook(bookEntity: BookEntity)

    @Query("SELECT * FROM book")
    fun getSavedBooks(): Flow<List<BookEntity>>

    @Delete
    fun deleteBook(bookEntity: BookEntity)
}