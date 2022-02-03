package com.example.vladyslavromanikdemo.domain.usecase.api

import com.example.vladyslavromanikdemo.domain.model.ProductDomainModel

/**
 * UseCase for saving products
 */
interface SaveProductsUseCase {

    suspend fun execute(productList: List<ProductDomainModel>)
}
