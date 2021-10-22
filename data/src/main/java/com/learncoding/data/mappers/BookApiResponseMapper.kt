package com.learncoding.data.mappers

import com.learncoding.data.api.BooksApiResponse
import com.learncoding.domain.entities.Volume
import com.learncoding.domain.entities.VolumeInfo

class BookApiResponseMapper {
    fun toVolumeList(response: BooksApiResponse): List<Volume> {
        return response.items.map {
            Volume(
                it.id, VolumeInfo(
                    it.volumeInfo.title,
                    it.volumeInfo.authors,
                    it.volumeInfo.imageLinks?.thumbnail?.replace("http", "https")
                )
            )
        }
    }
}