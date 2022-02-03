package com.example.vladyslavromanikdemo.di.modules.fragment

import com.example.vladyslavromanikdemo.presentation.screen.second.SecondFragment
import com.example.vladyslavromanikdemo.presentation.screen.second.SecondViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val secondFragmentModule = module {

    scope<SecondFragment> {

        viewModel {
            SecondViewModel()
        }
    }
}
