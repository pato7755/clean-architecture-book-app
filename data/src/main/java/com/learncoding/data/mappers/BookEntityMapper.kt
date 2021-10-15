package com.learncoding.data.mappers

import com.learncoding.data.entities.BookEntity
import com.learncoding.domain.entities.Volume
import com.learncoding.domain.entities.VolumeInfo

class BookEntityMapper {

    fun toBookEntity(volume: Volume): BookEntity {
        return BookEntity(
            id = volume.id,
            title = volume.volumeInfo.title,
            authors = volume.volumeInfo.authors,
            imageUrl = volume.volumeInfo.imageUrl
        )
    }

    fun toVolume(bookEntity: BookEntity): Volume {
        return Volume(
            bookEntity.id,
            VolumeInfo(bookEntity.title, bookEntity.authors, bookEntity.imageUrl)
        )
    }
}