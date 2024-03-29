package com.example.vladyslavromanikdemo.domain.repository

import com.example.vladyslavromanikdemo.domain.model.ProductDomainModel
import kotlinx.coroutines.flow.Flow

/**
 * Main repository for calling REST-api
 */
interface ProductRepository {

    val productsDataFlow: Flow<List<ProductDomainModel>>

    suspend fun saveProducts(productList: List<ProductDomainModel>)

//    suspend fun fetchProducts()
}
