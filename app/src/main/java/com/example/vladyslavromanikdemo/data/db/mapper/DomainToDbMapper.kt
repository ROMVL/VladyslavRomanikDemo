package com.example.vladyslavromanikdemo.data.db.mapper

import com.example.vladyslavromanikdemo.data.db.model.ProductDataBaseModel
import com.example.vladyslavromanikdemo.domain.model.ProductDomainModel

fun List<ProductDomainModel>.toDbModel(): List<ProductDataBaseModel> = this.map {
    ProductDataBaseModel(
        id = it.id,
        name = it.name,
        imageUrl = it.imageUrl,
        price = it.price,
    )
}
