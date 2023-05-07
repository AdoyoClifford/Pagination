package com.adoyo.pagination.data.mappers

import com.adoyo.pagination.data.local.BeerEntity
import com.adoyo.pagination.data.remote.BeerDto
import com.adoyo.pagination.domain.model.Beer

fun BeerDto.toBeerEntity(): BeerEntity {
    return BeerEntity(
        id = id,
        name = name,
        tagline = tagline,
        description = description,
        first_brewed = first_brewed,
        image_url = image_url
    )
}

fun BeerEntity.toBeer(): Beer {
    return Beer(
        id = id,
        name = name,
        tagline = tagline,
        description = description,
        firstBrewed = first_brewed,
        imageUrl = image_url
    )

}