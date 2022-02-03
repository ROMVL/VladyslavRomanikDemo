package com.example.vladyslavromanikdemo.presentation.screen.first

import androidx.lifecycle.ViewModel
import com.example.vladyslavromanikdemo.domain.model.ProductDomainModel
import com.example.vladyslavromanikdemo.domain.usecase.api.ProductsDataUseCase
import kotlinx.coroutines.flow.Flow

class FirstViewModel(
    productsDataUseCase: ProductsDataUseCase
) : ViewModel() {

    val productListDataState: Flow<List<ProductDomainModel>> = productsDataUseCase.execute()

}
