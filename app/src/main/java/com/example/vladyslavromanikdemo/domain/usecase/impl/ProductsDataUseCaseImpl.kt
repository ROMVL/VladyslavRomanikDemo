package com.example.vladyslavromanikdemo.domain.usecase.impl

import com.example.vladyslavromanikdemo.domain.repository.ProductRepository
import com.example.vladyslavromanikdemo.domain.usecase.api.ProductsDataUseCase

class ProductsDataUseCaseImpl(
    private val repository: ProductRepository
) : ProductsDataUseCase {

    override fun execute() = repository.productsDataFlow
}
