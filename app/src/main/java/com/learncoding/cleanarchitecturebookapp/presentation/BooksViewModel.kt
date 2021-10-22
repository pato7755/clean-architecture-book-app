package com.learncoding.cleanarchitecturebookapp.presentation

import androidx.lifecycle.ViewModel
import com.learncoding.cleanarchitecturebookapp.mappers.BookWithStatusMapper
import com.learncoding.domain.usecases.BookmarkBookUseCase
import com.learncoding.domain.usecases.GetBookmarksUseCase
import com.learncoding.domain.usecases.GetBooksUseCase
import com.learncoding.domain.usecases.UnbookmarkBookUseCase

class BooksViewModel(
    private val getBooksUseCase: GetBooksUseCase,
    private val getBookmarksUseCase: GetBookmarksUseCase,
    private val bookmarkBookUseCase: BookmarkBookUseCase,
    private val unbookmarkBookUseCase: UnbookmarkBookUseCase,
    private val mapper: BookWithStatusMapper
) : ViewModel() {


}