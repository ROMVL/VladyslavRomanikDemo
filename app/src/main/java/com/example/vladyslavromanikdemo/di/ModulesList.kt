package com.example.vladyslavromanikdemo.di

import com.example.vladyslavromanikdemo.core.TestApplication
import com.example.vladyslavromanikdemo.di.modules.dataBaseModule
import com.example.vladyslavromanikdemo.di.modules.fragment.firstFragmentModule
import com.example.vladyslavromanikdemo.di.modules.fragment.secondFragmentModule
import com.example.vladyslavromanikdemo.di.modules.mainModule

fun TestApplication.getModuleList() = listOf(
    dataBaseModule,
    mainModule
) + getFragmentModuleList()

private fun getFragmentModuleList() = listOf(
    firstFragmentModule,
    secondFragmentModule
)
