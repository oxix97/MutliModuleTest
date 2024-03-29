package com.example.myapplication.di

import com.example.domain.usecase.test.GetTestUseCase
import com.example.domain.usecase.tour.GetTourInformationUseCase
import org.koin.dsl.module

val useCaseModule = module {
    single { GetTestUseCase(get()) }
    single { GetTourInformationUseCase(get()) }
}
