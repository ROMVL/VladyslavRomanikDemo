package com.example.vladyslavromanikdemo.presentation.screen

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.vladyslavromanikdemo.domain.model.ProductDomainModel
import com.example.vladyslavromanikdemo.domain.usecase.api.SaveProductsUseCase
import kotlinx.coroutines.launch

class MainViewModel(
    private val saveProductsUseCase: SaveProductsUseCase
) : ViewModel() {

    fun saveData(productProduct: List<ProductDomainModel>) {
        viewModelScope.launch {
            saveProductsUseCase.execute(productProduct)
        }
    }

    companion object {

        internal const val FILE_PATH = "products_list.json"
    }

}
