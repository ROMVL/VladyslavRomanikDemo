package com.example.vladyslavromanikdemo.domain.usecase.impl

import com.example.vladyslavromanikdemo.domain.model.ProductDomainModel
import com.example.vladyslavromanikdemo.domain.usecase.api.SaveProductsUseCase
import com.example.vladyslavromanikdemo.domain.repository.ProductRepository

class SaveProductsUseCaseImpl(
    private val repository: ProductRepository
) : SaveProductsUseCase {

    override suspend fun execute(productList: List<ProductDomainModel>) {
        repository.saveProducts(productList)
    }
}
