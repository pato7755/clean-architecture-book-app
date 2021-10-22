package com.learncoding.domain.usecases

import com.learncoding.domain.entities.Volume
import com.learncoding.domain.repositories.BooksRepository

class UnbookmarkBookUseCase(private val booksRepository: BooksRepository) {
    suspend operator fun invoke(book: Volume) = booksRepository.unbookmark(book)
}