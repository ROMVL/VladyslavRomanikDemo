package com.example.vladyslavromanikdemo.data.cloud.mapper

import com.example.vladyslavromanikdemo.data.cloud.response.ProductResponseDataModel
import com.example.vladyslavromanikdemo.domain.model.ProductDomainModel

fun ProductResponseDataModel?.toDomain(): List<ProductDomainModel> = ArrayList<ProductDomainModel>().apply {
    this@toDomain?.productList?.forEach { product ->
        product?.let {
            if (it.id != null && it.name != null && it.imageUrl != null && it.price != null) add(
                ProductDomainModel(
                    id = it.id.toInt(),
                    name = it.name.orEmpty(),
                    imageUrl = it.imageUrl.orEmpty(),
                    price = it.price,
                )
            )
        }
    }
}
