package com.example.vladyslavromanikdemo.di.modules.fragment

import com.example.vladyslavromanikdemo.domain.usecase.api.ProductsDataUseCase
import com.example.vladyslavromanikdemo.domain.usecase.impl.ProductsDataUseCaseImpl
import com.example.vladyslavromanikdemo.presentation.screen.first.FirstFragment
import com.example.vladyslavromanikdemo.presentation.screen.first.FirstViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.bind
import org.koin.dsl.module
import org.koin.dsl.scoped

val firstFragmentModule = module {

    scope<FirstFragment> {

        scoped<ProductsDataUseCaseImpl>() bind ProductsDataUseCase::class

        viewModel { FirstViewModel(get()) }
    }
}
