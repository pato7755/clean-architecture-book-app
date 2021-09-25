package com.learncoding.domain.usecases

import com.learncoding.domain.repositories.BooksRepository

class GetBooksUseCase(private val booksRepository: BooksRepository) {

    suspend operator fun invoke(author: String) = booksRepository.getRemoteBooks(author)
}