package com.example.vladyslavromanikdemo.di.modules

import com.example.vladyslavromanikdemo.data.repository.ProductRepositoryImpl
import com.example.vladyslavromanikdemo.domain.repository.ProductRepository
import com.example.vladyslavromanikdemo.domain.usecase.api.SaveProductsUseCase
import com.example.vladyslavromanikdemo.domain.usecase.impl.SaveProductsUseCaseImpl
import com.example.vladyslavromanikdemo.presentation.screen.MainActivity
import com.example.vladyslavromanikdemo.presentation.screen.MainViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.bind
import org.koin.dsl.module
import org.koin.dsl.scoped

val mainModule = module {

    single<ProductRepository> { ProductRepositoryImpl(get()) }

    scope<MainActivity> {

        scoped<SaveProductsUseCaseImpl>() bind SaveProductsUseCase::class

        viewModel { MainViewModel(get()) }
    }
}
