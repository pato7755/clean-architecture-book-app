package com.learncoding.data.api

import retrofit2.Response
import retrofit2.http.Query

interface BooksApi {
    suspend fun getBooks(@Query("q") author: String): Response<BooksApiResponse>
}