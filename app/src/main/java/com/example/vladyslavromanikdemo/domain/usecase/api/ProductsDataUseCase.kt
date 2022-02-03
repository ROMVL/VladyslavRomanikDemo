package com.example.vladyslavromanikdemo.domain.usecase.api

import com.example.vladyslavromanikdemo.domain.model.ProductDomainModel
import kotlinx.coroutines.flow.Flow

/**
 * UseCase for getting products data
 */
interface ProductsDataUseCase {

    fun execute(): Flow<List<ProductDomainModel>>
}
