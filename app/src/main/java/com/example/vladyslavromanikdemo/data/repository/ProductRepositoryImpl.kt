package com.example.vladyslavromanikdemo.data.repository

import com.example.vladyslavromanikdemo.data.db.dao.ProductsDao
import com.example.vladyslavromanikdemo.data.db.mapper.toDbModel
import com.example.vladyslavromanikdemo.data.db.mapper.toDomain
import com.example.vladyslavromanikdemo.domain.model.ProductDomainModel
import com.example.vladyslavromanikdemo.domain.repository.ProductRepository
import kotlinx.coroutines.flow.map
import timber.log.Timber

class ProductRepositoryImpl(
    private val productsDao: ProductsDao
) : ProductRepository {

    override val productsDataFlow =
        productsDao.getProducts().map { it.toDomain() }

    override suspend fun saveProducts(productList: List<ProductDomainModel>) {
        runCatching {
            productList.toDbModel().let {
                productsDao.addProductList(it)
            }
        }.onFailure {
            Timber.e(it)
        }
    }

}
