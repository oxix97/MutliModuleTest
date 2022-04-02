package com.example.myapplication.di

import com.example.myapplication.presentation.ui.sign.SignViewModel
import com.example.myapplication.presentation.ui.test.TestViewModel
import com.example.myapplication.presentation.ui.tour.TourViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {
    viewModel { SignViewModel() }
    viewModel { TestViewModel(get()) }
    viewModel { TourViewModel(get()) }
}
